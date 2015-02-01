package com.meitu.dao;

import java.sql.ResultSet;

import com.meitu.bean.Article;

public interface ArticleDao {
	int insertArticleToDB(Article article);

	ResultSet getArticles(int refushState, String refushTime);

	int getArticlePraiseCount(int article_id);// 获取赞的数量

	boolean updateArticlePraiseCount(int article_id, int praise_count);// 更新赞的数量

	int getArticleCommentCount(int article_id);// 获取评论数量

	boolean updateArticleCommentCount(int article_id, int praise_count);// 更新评论数量

	boolean updateArticleUpdateTime(int article_id);// 赞或者评论后 更新时间
}
