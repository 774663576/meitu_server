package com.meitu.bean;

public class Praise {
	private int user_id;
	private int article_id;
	private String user_avatar = "";

	public String getUser_avatar() {
		return user_avatar;
	}

	public void setUser_avatar(String user_avatar) {
		this.user_avatar = user_avatar;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getGrowth_id() {
		return article_id;
	}

	public void setGrowth_id(int growth_id) {
		this.article_id = growth_id;
	}

}
