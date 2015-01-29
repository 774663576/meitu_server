package com.meitu.controller;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.meitu.bean.Article;
import com.meitu.bean.ArticleImage;
import com.meitu.bean.Comment;
import com.meitu.dao.ArticleDao;
import com.meitu.dao.ArticleImageDao;
import com.meitu.dao.CommentDao;
import com.meitu.db.DBConnection;
import com.meitu.enums.ErrorEnum;
import com.meitu.utils.Constants;
import com.meitu.utils.DateUtils;
import com.meitu.utils.JsonUtil;

@Controller
public class ArticleController {
	@Autowired
	private ArticleDao dao;
	@Autowired
	private ArticleImageDao imgDao;
	@Autowired
	private CommentDao commentDao;

	@ResponseBody
	@RequestMapping(value = "/addarticle.do", method = RequestMethod.POST)
	public String addArticle(HttpServletRequest request) {
		MultipartResolver resolver = new CommonsMultipartResolver(request
				.getSession().getServletContext());
		MultipartHttpServletRequest multipartRequest = resolver
				.resolveMultipart(request);
		String img_path = request.getSession().getServletContext()
				.getRealPath("article_image");
		String serverPath = Constants.SERVER_PATH + "/article_image/";
		List<MultipartFile> files = multipartRequest.getFiles("image");
		int publisher_id = Integer.valueOf(multipartRequest
				.getParameter("user_id"));
		String content = multipartRequest.getParameter("content");
		String time = DateUtils.getArticleShowTime();
		Article article = new Article();
		article.setLast_update_time(time);
		article.setTime(time);
		article.setPublisher_id(publisher_id);
		article.setContent(content);
		Map<String, Object> params = new HashMap<String, Object>();
		int article_id = dao.insertArticleToDB(article);
		List<ArticleImage> imageLists = new ArrayList<ArticleImage>();
		if (article_id > 0) {
			int imgIndex = 1;
			try {
				for (MultipartFile multipartFile : files) {
					if (!multipartFile.isEmpty()) {
						String file_name = multipartFile.getOriginalFilename();
						String save_filename = DateUtils.getUpLoadFileName()
								+ "_"
								+ imgIndex
								+ file_name.substring(file_name.length() - 4,
										file_name.length());
						File targetFile = new File(img_path, save_filename);
						if (!targetFile.exists()) {
							targetFile.mkdirs();
						}
						multipartFile.transferTo(targetFile);
						ArticleImage img = new ArticleImage();
						img.setArticle_id(article_id);
						img.setImg_url(serverPath + save_filename);
						imageLists.add(img);
					}
					imgIndex++;
				}
				imgDao.insertGrowthImageToDB(imageLists);
			} catch (Exception e) {
				e.printStackTrace();
			}
			params.put("rt", 1);
			params.put("article_id", article_id);
			params.put("images", imageLists);
			params.put("time", time);
		} else {
			params.put("rt", 0);
			params.put("err", ErrorEnum.INVALID.name());
		}
		JSONObject jsonObjectFromMap = JSONObject.fromObject(params);
		System.out.println(jsonObjectFromMap.toString());
		return jsonObjectFromMap.toString();

	}

	@ResponseBody
	@RequestMapping(value = "/articles.do", method = RequestMethod.POST)
	public String getArticles(HttpServletRequest request) {
		int user_id = Integer.valueOf(request.getParameter("user_id"));
		int refushState = Integer.valueOf(request.getParameter("refushState"));
		String refushTime = request.getParameter("refushTime");
		System.out.println(refushTime);
		ResultSet res = dao.getArticles(refushState, refushTime);
		List<Article> lists = new ArrayList<Article>();
		Map<String, Object> params = new HashMap<String, Object>();
		try {
			while (res.next()) {
				Article article = new Article();
				article.setArticle_id(res.getInt("article_id"));
				article.setContent(res.getString("content"));
				article.setTime(res.getString("time"));
				int publisher_id = res.getInt("publisher_id");
				article.setPublisher_id(publisher_id);
				article.setImages(imgDao.getImagesByArticleID(res
						.getInt("article_id")));
				article.setPublisher_avatar(res.getString("user_avatar"));
				article.setPublisher_name(res.getString("user_name"));
				article.setPraise_count(res.getInt("praise_count"));
				article.setLast_update_time(res.getString("last_update_time"));
				lists.add(article);
			}
			params.put("articles", lists);
			params.put("lastReqTime", DateUtils.getArticleShowTime());
			params.put("rt", 1);
		} catch (SQLException e) {
			e.printStackTrace();
			params.put("rt", 0);
			params.put("err", ErrorEnum.INVALID.name());
		} finally {
			DBConnection.close(res);
		}
		JSONObject jsonObjectFromMap = JSONObject.fromObject(params);
		System.out.println(jsonObjectFromMap);
		return jsonObjectFromMap.toString();

	}

	@ResponseBody
	@RequestMapping(value = "/articlecomment.do", method = RequestMethod.POST)
	public String articleComment(HttpServletRequest request) {
		String comment_content = request.getParameter("comment_content");
		String reply_someone_name = request.getParameter("reply_someone_name");
		String reply_someone_id = request.getParameter("reply_someone_id");
		int article_id = Integer.valueOf(request.getParameter("article_id"));
		String publisher_id = request.getParameter("user_id");
		String user_name = request.getParameter("user_name");
		int article_publisher_id = Integer.valueOf(request
				.getParameter("article_publisher_id"));
		Comment comment = new Comment();
		comment.setComment_content(comment_content);
		comment.setReply_someone_id(Integer.valueOf(reply_someone_id));
		comment.setReply_someone_name(reply_someone_name);
		comment.setComment_time(DateUtils.getArticleShowTime());
		comment.setArticle_id(article_id);
		comment.setPublisher_id(Integer.valueOf(publisher_id));
		int id = commentDao.insertComment(comment);
		Map<String, Object> params = new HashMap<String, Object>();
		if (id < 0) {
			params.put("err", ErrorEnum.INVALID.name());
			params.put("rt", 0);
		} else {
			params.put("rt", 1);
			params.put("comment_id", id);

		}
		System.out.println(JsonUtil.toJsonString(params));
		return JsonUtil.toJsonString(params);

	}

	public ArticleDao getDao() {
		return dao;
	}

	public void setDao(ArticleDao dao) {
		this.dao = dao;
	}

	public ArticleImageDao getImgDao() {
		return imgDao;
	}

	public void setImgDao(ArticleImageDao imgDao) {
		this.imgDao = imgDao;
	}

	public CommentDao getCommentDao() {
		return commentDao;
	}

	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}
}
