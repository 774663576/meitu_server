package com.meitu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.meitu.bean.User;
import com.meitu.dao.UserDao;
import com.meitu.db.DBConnection;
import com.meitu.enums.ErrorEnum;

@Repository
public class UserDaoImpl implements UserDao {

	public boolean add(User user) {
		Connection conn = DBConnection.getConnection(); // ������Ӷ���
		String addSQL = "insert into user(user_name,user_phone,user_gender,user_avatar,user_password,user_birthday) values(?,?,?,?,?,?)";
		PreparedStatement pstmt = null; // ����Ԥ�������
		try {
			pstmt = conn.prepareStatement(addSQL); // ���Ԥ������󲢸�ֵ
			pstmt.setString(1, user.getUser_name());
			pstmt.setString(2, user.getUser_phone());// ���õڶ�������
			pstmt.setString(3, user.getUser_gender());
			pstmt.setString(4, user.getUser_avatar());
			pstmt.setString(5, user.getUser_password());
			pstmt.setString(6, user.getUser_birthday());
			int count = pstmt.executeUpdate();
			System.out.println(count);
			return count > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt); // �ر�Ԥ�������
		}
		return false;
	}

	public boolean verifyCellphone(String cellPhone) {
		Connection conn = DBConnection.getConnection(); // ������Ӷ���
		String sql = "select user_id from user where user_phone = ? ";
		PreparedStatement pstmt = null; // ����Ԥ�������
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql); // ���Ԥ������󲢸�ֵ
			pstmt.setString(1, cellPhone);
			rs = pstmt.executeQuery(); // ִ�в�ѯ
			while (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(rs); // �رս��������
			DBConnection.close(pstmt); // �ر�Ԥ�������
		}
		return false;
	}

	public Object[] login(String phone, String password) {
		System.out.println("login:" + phone + "    " + password);
		Connection conn = DBConnection.getConnection(); // ������Ӷ���
		String sql = "select * from user where user_phone = ? and user_password = ?";
		PreparedStatement pstmt = null; // ����Ԥ�������
		ResultSet rs = null;
		User user = new User();
		try {
			pstmt = conn.prepareStatement(sql); // ���Ԥ������󲢸�ֵ
			pstmt.setString(1, phone);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery(); // ִ�в�ѯ
			while (rs.next()) {
				user.setUser_avatar(rs.getString("user_avatar"));
				user.setUser_birthday(rs.getString("user_birthday"));
				user.setUser_gender(rs.getString("user_gender"));
				user.setUser_id(rs.getInt("user_id"));
				user.setUser_name(rs.getString("user_name"));
				return new Object[] { ErrorEnum.NONE, user };
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(rs); // �رս��������
			DBConnection.close(pstmt); // �ر�Ԥ�������
		}
		return new Object[] { ErrorEnum.WRONG_PASSWORD, null };
	}

}
