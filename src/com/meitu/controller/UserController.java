package com.meitu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meitu.bean.User;
import com.meitu.dao.UserDao;

@Controller
public class UserController {
	@Autowired
	private UserDao dao;

	@ResponseBody
	@RequestMapping("/addmember")
	public String addmember(HttpServletRequest request) {
		User user = new User();
		user.setUser_gender(request.getParameter("user_gender"));
		user.setUser_name(request.getParameter("user_name"));
		user.setUser_phone(request.getParameter("user_phone"));
		dao.add(user);
		return user.toString();
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
