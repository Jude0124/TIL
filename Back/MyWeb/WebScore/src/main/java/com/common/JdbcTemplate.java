package com.common;

import java.sql.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JdbcTemplate {
//////////////연결	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Context initContext = new InitialContext(); // 웹플젝의 초기화
			Context envContext = (Context) initContext.lookup("java:/comp/env"); // 환경설정디렉토리를 찾아라
			DataSource ds = (DataSource) envContext.lookup("jdbc/mydb"); // 데이터베이스 연결 별칭을 찾아라
			conn = ds.getConnection(); // 연결한 결과를 Connection에게 리턴해라
			conn.setAutoCommit(false);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

////////////////////연결상태
	public static boolean isConnection(Connection conn) {
		boolean valid = true;
		try {
			if (conn == null || conn.isClosed()) {
				valid = false;
			}
		} catch (SQLException se) {
			valid = true;
			se.printStackTrace();
		}
		return valid;
	}

///////////////_ResultSet close
	public static void close(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

///////////////_Statement close
	public static void close(Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

///////////////_Connection close
	public static void close(Connection conn) {
		try {
			if (isConnection(conn)) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

///////////////commit

	public static void commit(Connection conn) {
		if (isConnection(conn)) {
			try {
				conn.commit();//insert, delete, update 쿼리 저장
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

///////////////rollback
	public static void rollback(Connection conn) {
		if (isConnection(conn)) {
			try {
				conn.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
