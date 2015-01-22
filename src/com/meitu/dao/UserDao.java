package com.meitu.dao;

import com.meitu.bean.User;

public interface UserDao {
	boolean add(User user);

	boolean verifyCellphone(String cellphone);
}
