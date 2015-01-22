package com.meitu.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.meitu.bean.User;
import com.meitu.dao.UserDao;
import com.meitu.enums.ErrorEnum;
import com.meitu.utils.Constants;
import com.meitu.utils.DateUtils;
import com.meitu.utils.JsonUtil;

@Controller
public class UserController {
	@Autowired
	private UserDao dao;

	@ResponseBody
	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String register(@RequestParam MultipartFile file,
			HttpServletRequest request) {
		String avatar_path = request.getSession().getServletContext()
				.getRealPath("avatar_image");
		String serverPath = Constants.SERVER_PATH + "/avatar_image/";
		String fileName = file.getOriginalFilename();
		System.out.println(fileName);
		String save_filename = DateUtils.getUpLoadFileName()
				+ fileName.substring(fileName.length() - 4, fileName.length());
		File targetFile = new File(avatar_path, save_filename);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		// ±£´æ
		try {
			file.transferTo(targetFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		User user = new User();
		user.setUser_gender(request.getParameter("user_gender"));
		user.setUser_name(request.getParameter("user_name"));
		user.setUser_phone(request.getParameter("user_phone"));
		user.setUser_avatar(serverPath + save_filename);
		user.setUser_birthday(request.getParameter("user_birthday"));
		user.setUser_password(request.getParameter("user_password"));
		boolean success = dao.add(user);
		Map<String, Object> params = new HashMap<String, Object>();
		if (success) {
			params.put("err", ErrorEnum.INVALID);
			params.put("rt", 0);
		} else {
			params.put("rt", 1);
		}
		return JsonUtil.toJsonString(params);
	}

	@ResponseBody
	@RequestMapping(value = "/checkoutMobilNum.do", method = RequestMethod.POST)
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
