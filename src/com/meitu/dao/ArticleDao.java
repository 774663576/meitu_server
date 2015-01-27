package com.meitu.dao;

import java.sql.ResultSet;

import com.meitu.bean.Article;

public interface ArticleDao {
	int insertArticleToDB(Article article);

	ResultSet getArticles(int refushState, String refushTime);

}
