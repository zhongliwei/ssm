package com.lin.utils;

import java.sql.*;

public class DbUtil {// 构造方法
	private DbUtil() {
	}

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");// jdbc

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} // 加载驱动程序);

	}

	public static Connection getConn() {
		Connection conn = null;
		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/learning", "root", "123456");// url+用户+密码
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return conn;

	}

	public static PreparedStatement getPstmt(Connection conn, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return pstmt;
	}

	public static ResultSet getRs(PreparedStatement pstmt) {
		ResultSet rs = null;
		try {
			rs = pstmt.executeQuery();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return rs;
	}

	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			rs = null;
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			stmt = null;
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			conn = null;
		}

	}

}