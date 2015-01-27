package com.meitu.dao;

import java.util.List;

import com.meitu.bean.ArticleImage;

public interface ArticleImageDao {
	boolean insertGrowthImageToDB(List<ArticleImage> listImages);

	List<ArticleImage> getImagesByArticleID(int article_id);
}
