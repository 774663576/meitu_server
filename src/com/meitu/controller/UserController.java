package com.meitu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meitu.bean.User;
import com.meitu.dao.UserDao;
import com.meitu.enums.ErrorEnum;
import com.meitu.utils.JsonUtil;

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

	@ResponseBody
	@RequestMapping("/checkoutMobilNum")
	public String checkoutMobile(HttpServletRequest request) {
		String mobile_num = request.getParameter("user_phone");
		boolean isExist = dao.verifyCellphone(mobile_num);
		Map<String, Object> params = new HashMap<String, Object>();
		if (isExist) {
			params.put("err", ErrorEnum.USER_ALREADY_EXIST.name());
			params.put("rt", 0);
		} else {
			params.put("rt", 1);
		}
		return JsonUtil.toJsonString(params);

	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
