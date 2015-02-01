package com.meitu.dao;

import java.sql.ResultSet;

import com.meitu.bean.Article;

public interface ArticleDao {
	int insertArticleToDB(Article article);

	ResultSet getArticles(int refushState, String refushTime);

	int getArticlePraiseCount(int article_id);// ��ȡ�޵�����

	boolean updateArticlePraiseCount(int article_id, int praise_count);// �����޵�����

	int getArticleCommentCount(int article_id);// ��ȡ��������

	boolean updateArticleCommentCount(int article_id, int praise_count);// ������������

	boolean updateArticleUpdateTime(int article_id);// �޻������ۺ� ����ʱ��
}
