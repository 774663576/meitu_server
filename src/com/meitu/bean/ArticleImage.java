package com.meitu.bean;

public class ArticleImage {
	private int img_id = 0;
	private int article_id = 0;
	private String img_url = "";

	public int getImg_id() {
		return img_id;
	}

	public void setImg_id(int img_id) {
		this.img_id = img_id;
	}

	public int getArticle_id() {
		return article_id;
	}

	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

	@Override
	public String toString() {
		return "img_id" + this.img_id + "  img_url:" + this.img_url;
	}
}
