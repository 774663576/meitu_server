package com.meitu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.meitu.bean.ArticleImage;
import com.meitu.dao.ArticleImageDao;
import com.meitu.db.DBConnection;

@Repository
public class ArticleImageDaoImpl implements ArticleImageDao {

	public boolean insertGrowthImageToDB(List<ArticleImage> listImages) {
		Connection conn = DBConnection.getConnection();
		String sql = "insert into article_img (article_id,image_url) values(?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			for (ArticleImage img : listImages) {
				pstmt.setInt(1, img.getArticle_id());
				pstmt.setString(2, img.getImg_url());
				pstmt.executeUpdate();
			}
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<ArticleImage> getImagesByArticleID(int article_id) {
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet res = null;
		String sql = "select * from article_img where article_id=?";
		List<ArticleImage> images = new ArrayList<ArticleImage>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, article_id);
			res = pstmt.executeQuery();
			while (res.next()) {
				ArticleImage img = new ArticleImage();
				img.setImg_url(res.getString("image_url"));
				img.setImg_id(res.getInt("image_id"));
				img.setArticle_id(article_id);
				images.add(img);
			}
			return images;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt);
			DBConnection.close(res);
		}
		return null;
	}

}
