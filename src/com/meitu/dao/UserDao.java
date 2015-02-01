package com.meitu.dao;

import com.meitu.bean.User;

public interface UserDao {
	boolean add(User user);

	boolean verifyCellphone(String cellphone);

	Object[] login(String phone, String password);

	User getUserInfo(int user_id);
}
