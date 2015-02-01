package com.meitu.dao;

import java.util.List;

import com.meitu.bean.Comment;

public interface CommentDao {
	int insertComment(Comment comment);// ����id

	List<Comment> getCommentByArticleID(int article_id);

	boolean deleteCommentByID(int comment_id);
}
