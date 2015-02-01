package com.meitu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.meitu.bean.Praise;
import com.meitu.dao.PraiseDao;
import com.meitu.db.DBConnection;

@Repository
public class PraiseDaoImpl implements PraiseDao {

	public boolean insertPraiseToDB(Praise praise) {
		Connection conn = DBConnection.getConnection(); // 获得连接对象
		String addSQL = "insert into  praise(user_id,article_id) values(?,?)";
		PreparedStatement pstmt = null; // 声明预处理对象
		try {
			pstmt = conn.prepareStatement(addSQL); // 获得预处理对象并赋值
			pstmt.setInt(1, praise.getUser_id());
			pstmt.setInt(2, praise.getArticle_id());// 设置第二个参数
			int count = pstmt.executeUpdate(); // 执行更新
			System.out.println("praise:" + count);
			return count > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt); // 关闭预处理对象
		}
		return false;
	}

	public int findPraiseByUserID(Praise praise) {
		Connection conn = DBConnection.getConnection(); // 获得连接对象
		PreparedStatement pstmt = null; // 声明预处理对象
		ResultSet rs = null;
		String findByIDSQL = "select article_id from  praise where user_id = ? and article_id =?"; // SQL语句
		try {
			pstmt = conn.prepareStatement(findByIDSQL); // 获得预处理对象并赋值
			pstmt.setInt(1, praise.getUser_id()); // 设置参数
			pstmt.setInt(2, praise.getArticle_id()); // 设置参数

			rs = pstmt.executeQuery(); // 执行查询
			while (rs.next()) {
				return 1;
			}
		} catch (Exception e) {
		} finally {
			DBConnection.close(rs); // 关闭结果集对象
			DBConnection.close(pstmt);
		}
		return 0;
	}

	public boolean cancelPraise(Praise praise) {
		Connection conn = DBConnection.getConnection(); // 获得连接对象
		PreparedStatement pstmt = null; // 声明预处理对象
		String findByIDSQL = "DELETE FROM  praise WHERE article_id=? and user_id=?"; // SQL语句
		try {
			pstmt = conn.prepareStatement(findByIDSQL); // 获得预处理对象并赋值
			pstmt.setInt(1, praise.getArticle_id()); // 设置参数
			pstmt.setInt(2, praise.getUser_id());
			int res = pstmt.executeUpdate(); // 执行查询
			System.out.println("cancel:" + res);
			return res > 0;
		} catch (Exception e) {
		} finally {
			DBConnection.close(pstmt);
		}
		return false;
	}

	public List<Praise> findPraiseUserByArticleID(int article_id) {
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet res = null;
		String sql = "select user.user_avatar,praise.user_id from user, praise where article_id=? and user.user_id=praise.user_id";
		List<Praise> comments = new ArrayList<Praise>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, article_id);
			res = pstmt.executeQuery();
			while (res.next()) {
				Praise praise = new Praise();
				praise.setUser_avatar(res.getString("user_avatar"));
				praise.setUser_id(res.getInt("user_id"));
				comments.add(praise);
			}
			return comments;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt);
			DBConnection.close(res);
		}
		return null;
	}
}
