package com.meitu.dao;

import java.util.List;

import com.meitu.bean.Praise;

public interface PraiseDao {
	boolean insertPraiseToDB(Praise praise);// ��

	boolean cancelPraise(Praise praise);// ȡ����

	int findPraiseByUserID(Praise praise);// �����û��Ƿ�����

	List<Praise> findPraiseUserByArticleID(int article_id);// ���Ҹóɳ����޵��û��б�
}
