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
		Connection conn = DBConnection.getConnection(); // ������Ӷ���
		String addSQL = "insert into user(user_name,user_phone,user_gender) values(?,?,?)";
		PreparedStatement pstmt = null; // ����Ԥ�������
		try {
			pstmt = conn.prepareStatement(addSQL); // ���Ԥ������󲢸�ֵ
			pstmt.setString(1, user.getUser_name());
			pstmt.setString(2, user.getUser_phone());// ���õڶ�������
			pstmt.setString(3, user.getUser_gender());
			pstmt.executeUpdate(); // ִ�и���
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt); // �ر�Ԥ�������
		}
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

}
