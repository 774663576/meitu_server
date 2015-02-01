package com.meitu.dao;

import java.util.List;

import com.meitu.bean.Praise;

public interface PraiseDao {
	boolean insertPraiseToDB(Praise praise);// 赞

	boolean cancelPraise(Praise praise);// 取消赞

	int findPraiseByUserID(Praise praise);// 查找用户是否已赞

	List<Praise> findPraiseUserByArticleID(int article_id);// 查找该成长所赞的用户列表
}
