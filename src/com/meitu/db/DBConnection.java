package com.meitu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class DBConnection {
	private static final String DBDRIVER = "com.mysql.jdbc.Driver"; // ����������
	private static final String DBURL = "jdbc:mysql://127.0.0.1:3306/meitu";// ����URL
	private static final String DBUSER = "root"; // ���ݿ��û���
	private static final String DBPASSWORD = "passwordbinbin"; // ���ݿ�����
	private static Connection conn = null; // ����һ�����Ӷ���

	static {
		try {
			Class.forName(DBDRIVER); // ע������
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD); // ������Ӷ���
		} catch (ClassNotFoundException e) { // �����������޷��ҵ��쳣
			e.printStackTrace();
			System.out.println(e.toString());
		} catch (SQLException e) { // ����SQL�쳣
			e.printStackTrace();
			System.out.println(e.toString());

		}
	}

	public static int getInt() {
		return -8;

	}

	public static Connection getConnection() {
		return conn;
	}

	public static void close(Connection conn) {// �ر����Ӷ���
		if (conn != null) { // ���conn���Ӷ���Ϊ��
			try {
				conn.close(); // �ر�conn���Ӷ������
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(PreparedStatement pstmt) {// �ر�Ԥ��������
		if (pstmt != null) { // ���pstmtԤ��������Ϊ��
			try {
				pstmt.close(); // �ر�pstmtԤ��������
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs) {// �رս��������
		if (rs != null) { // ���rs���������Ϊnull
			try {
				rs.close(); // �ر�rs���������
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		getConnection();
	}
}