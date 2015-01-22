package com.meitu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.meitu.bean.User;
import com.meitu.dao.UserDao;
import com.meitu.db.DBConnection;

@Repository
public class UserDaoImpl implements UserDao {

	public void add(User user) {
		Connection conn = DBConnection.getConnection(); // 获得连接对象
		String addSQL = "insert into user(user_name,user_phone,user_gender) values(?,?,?)";
		PreparedStatement pstmt = null; // 声明预处理对象
		try {
			pstmt = conn.prepareStatement(addSQL); // 获得预处理对象并赋值
			pstmt.setString(1, user.getUser_name());
			pstmt.setString(2, user.getUser_phone());// 设置第二个参数
			pstmt.setString(3, user.getUser_gender());
			pstmt.executeUpdate(); // 执行更新
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt); // 关闭预处理对象
		}
	}

	public boolean verifyCellphone(String cellPhone) {
		Connection conn = DBConnection.getConnection(); // 获得连接对象
		String sql = "select user_id from user where user_phone = ? ";
		PreparedStatement pstmt = null; // 声明预处理对象
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql); // 获得预处理对象并赋值
			pstmt.setString(1, cellPhone);
			rs = pstmt.executeQuery(); // 执行查询
			while (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(rs); // 关闭结果集对象
			DBConnection.close(pstmt); // 关闭预处理对象
		}
		return false;
	}

}
