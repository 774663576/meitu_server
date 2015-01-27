package com.meitu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.meitu.bean.Article;
import com.meitu.dao.ArticleDao;
import com.meitu.db.DBConnection;
import com.meitu.enums.Status;

@Repository
public class ArticleDaoImpl implements ArticleDao {

	public int insertArticleToDB(Article article) {
		Connection conn = DBConnection.getConnection();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		int autoIncKeyFromApi = -1;

		String sql = "insert into article(publisher_id,content,time,last_update_time,state) values(?,?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, article.getPublisher_id());
			pstmt.setString(2, article.getContent());
			pstmt.setString(3, article.getTime());
			pstmt.setString(4, article.getTime());
			pstmt.setString(5, Status.ADD.name());

			pstmt.executeUpdate();
			rs = pstmt.getGeneratedKeys(); // 获取自增主键！
			if (rs.next()) {
				autoIncKeyFromApi = rs.getInt(1);
			} else {
			}
			return autoIncKeyFromApi;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt);
			DBConnection.close(rs);
		}
		return autoIncKeyFromApi;
	}

	public ResultSet getArticles(int refushState, String refushTime) {
		Connection conn = DBConnection.getConnection();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		String sql = "";
		if (refushState == 1) {
			sql = "select article.*,`user`.user_avatar,`user`.user_name  from  article  INNER JOIN  `user`  on  article.publisher_id =`user`.user_id where  (time>? or last_update_time > ?) order by time desc limit 0,20";
		} else {
			sql = "select article.*,`user`.user_avatar,`user`.user_name  from  article  INNER JOIN  `user`  on  article.publisher_id =`user`.user_id where  (time <? ) order by time desc limit 0,20";
		}
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, refushTime);
			if (refushState == 1) {
				pstmt.setString(2, refushTime);
			}
			rs = pstmt.executeQuery();
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
