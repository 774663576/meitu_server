package com.meitu.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

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
	public String register(HttpServletRequest request) {
		MultipartResolver resolver = new CommonsMultipartResolver(request
				.getSession().getServletContext());
		MultipartHttpServletRequest multipartRequest = resolver
				.resolveMultipart(request);
		MultipartFile multipartFile = multipartRequest.getFile("image");
		String avatar_path = request.getSession().getServletContext()
				.getRealPath("avatar_image");
		String serverPath = Constants.SERVER_PATH + "/avatar_image/";
		String file_name = multipartFile.getOriginalFilename();
		String save_filename = DateUtils.getUpLoadFileName()
				+ file_name.substring(file_name.length() - 4,
						file_name.length());
		File targetFile = new File(avatar_path, save_filename);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}
		try {
			multipartFile.transferTo(targetFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		User user = new User();
		user.setUser_gender(multipartRequest.getParameter("user_gender"));
		user.setUser_name(multipartRequest.getParameter("user_name"));
		user.setUser_phone(multipartRequest.getParameter("user_phone"));
		user.setUser_avatar(serverPath + save_filename);
		user.setUser_birthday(multipartRequest.getParameter("user_birthday"));
		user.setUser_password(multipartRequest.getParameter("user_password"));
		boolean success = dao.add(user);
		Map<String, Object> params = new HashMap<String, Object>();
		if (!success) {
			params.put("err", ErrorEnum.INVALID);
			params.put("rt", 0);
		} else {
			params.put("rt", 1);
			params.put("user_avatar", user.getUser_avatar());
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
