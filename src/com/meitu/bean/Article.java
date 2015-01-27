package com.meitu.bean;

import java.util.ArrayList;
import java.util.List;

public class Article {
	private int article_id = 0;
	private int publisher_id = 0;
	private String time = "";
	private String content = "";
	private List<ArticleImage> images = new ArrayList<ArticleImage>();
	private List<Comment> comments = new ArrayList<Comment>();
	private String publisher_name = "";
	private String publisher_avatar = "";
	private int isPraise;// 1 ÔŞ 0Î´ÔŞ
	private int praise_count;
	private List<Praise> praises = new ArrayList<Praise>();
	private String last_update_time = "0";
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getArticle_id() {
		return article_id;
	}

	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}

	public int getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<ArticleImage> getImages() {
		return images;
	}

	public void setImages(List<ArticleImage> images) {
		this.images = images;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public String getPublisher_name() {
		return publisher_name;
	}

	public void setPublisher_name(String publisher_name) {
		this.publisher_name = publisher_name;
	}

	public String getPublisher_avatar() {
		return publisher_avatar;
	}

	public void setPublisher_avatar(String publisher_avatar) {
		this.publisher_avatar = publisher_avatar;
	}

	public int getIsPraise() {
		return isPraise;
	}

	public void setIsPraise(int isPraise) {
		this.isPraise = isPraise;
	}

	public int getPraise_count() {
		return praise_count;
	}

	public void setPraise_count(int praise_count) {
		this.praise_count = praise_count;
	}

	public List<Praise> getPraises() {
		return praises;
	}

	public void setPraises(List<Praise> praises) {
		this.praises = praises;
	}

	public String getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(String last_update_time) {
		this.last_update_time = last_update_time;
	}

}
