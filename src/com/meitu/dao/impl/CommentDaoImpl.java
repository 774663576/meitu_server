package com.meitu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.meitu.bean.Comment;
import com.meitu.dao.CommentDao;
import com.meitu.db.DBConnection;

@Repository
public class CommentDaoImpl implements CommentDao {

	public int insertComment(Comment comment) {
		Connection conn = DBConnection.getConnection(); // 获得连接对象
		String sql = "insert into comment (article_id,publisher_id,comment_content,comment_time,reply_someone_name,reply_someone_id)values(?,?,?,?,?,?)";

		PreparedStatement pstmt = null; // 声明预处理对象
		ResultSet rs = null;
		int autoIncKeyFromApi = -1;

		try {
			pstmt = conn.prepareStatement(sql); // 获得预处理对象并赋值
			pstmt.setInt(1, comment.getArticle_id());
			pstmt.setInt(2, comment.getPublisher_id());
			pstmt.setString(3, comment.getComment_content());// 设置第二个参数
			pstmt.setString(4, comment.getComment_time());
			pstmt.setString(5, comment.getReply_someone_name());
			pstmt.setInt(6, comment.getReply_someone_id());
			pstmt.executeUpdate(); // 执行更新
			rs = pstmt.getGeneratedKeys(); // 获取自增主键！
			if (rs.next()) {
				autoIncKeyFromApi = rs.getInt(1);
			} else {
			}
			return autoIncKeyFromApi;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt); // 关闭预处理对象
		}
		return autoIncKeyFromApi;

	}

	public List<Comment> getCommentByArticleID(int article_id) {
		Connection conn = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet res = null;
		String sql = "select * ,`user`.user_avatar,`user`.user_name from comment INNER JOIN  `user`  on  comment.publisher_id =`user`.user_id  where article_id=?";
		List<Comment> comments = new ArrayList<Comment>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, article_id);
			res = pstmt.executeQuery();
			while (res.next()) {
				Comment comment = new Comment();
				comment.setComment_content(res.getString("comment_content"));
				comment.setComment_id(res.getInt("comment_id"));
				comment.setComment_time(res.getString("comment_time"));
				comment.setReply_someone_id(res.getInt("reply_someone_id"));
				comment.setReply_someone_name(res
						.getString("reply_someone_name"));
				int publisher_id = res.getInt("publisher_id");
				comment.setPublisher_id(publisher_id);
				comment.setArticle_id(res.getInt("article_id"));
				comment.setPublisher_avatar(res.getString("user_avatar"));
				comment.setPublisher_name(res.getString("user_name"));
				comments.add(comment);
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

	public boolean deleteCommentByID(int comment_id) {
		Connection conn = DBConnection.getConnection(); // 获得连接对象
		String sql = "delete from comment where comment_id=?";
		PreparedStatement pstmt = null; // 声明预处理对象
		try {
			pstmt = conn.prepareStatement(sql); // 获得预处理对象并赋值
			pstmt.setInt(1, comment_id);
			return pstmt.executeUpdate() > 0; // 执行更新
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt); // 关闭预处理对象
			// DBConnection.close(conn); // 关闭连接对象
		}
		return false;
	}
}
