package com.meitu.dao;

import java.util.List;

import com.meitu.bean.Comment;

public interface CommentDao {
	int insertComment(Comment comment);// ·µ»Øid

	List<Comment> getCommentByArticleID(int growth_id);

	boolean deleteCommentByID(int comment_id);
}
