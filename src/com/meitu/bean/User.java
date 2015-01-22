package com.meitu.bean;

public class User {
	private int user_id;
	private String user_name = "";
	private String user_phone = "";
	private String user_gender = "";

	@Override
	public String toString() {
		return "user_id:" + user_id + "  user_name:" + user_name
				+ "  user_phone:" + user_phone + "  user_gender:" + user_gender;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_gender() {
		return user_gender;
	}

	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}

}
