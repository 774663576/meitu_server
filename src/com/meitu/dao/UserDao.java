package com.meitu.dao;

import com.meitu.bean.User;

public interface UserDao {
	void add(User user);

	boolean verifyCellphone(String cellphone);
}
