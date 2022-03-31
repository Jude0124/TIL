package dbProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BookDAO {

	public void insertBook(BookDTO bookDTO) {
		
		String sql = "insert into book values(?,?,?,?,?,?);";
		
		ConnectionManager cm = new ConnectionManager();
	
		Connection con = cm.getConnection();

		PreparedStatement pstmt = null;
		int affectedCount = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bookDTO.getBookNo());
			pstmt.setString(2, bookDTO.getBookTitle());
			pstmt.setString(3, bookDTO.getBookAuthor());
			pstmt.setInt(4, bookDTO.getBookYear());
			pstmt.setInt(5, bookDTO.getBookPrice());
			pstmt.setString(6, bookDTO.getBookPublisher());
			affectedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		cm.closeConnection(con, pstmt, null);

	}

	public void selectBook() {
		String sql = "select bookNo,bookTitle,bookAuthor,bookYear,bookPrice,bookPublisher FROM book;";

		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t %n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cm.closeConnection(con, stmt, rs);
		}

	}
}

class ConnectionManager {

	public Connection getConnection() {
		Connection con = null;

		String url = "jdbc:mysql://localhost:3306/sqldb";

		String driver = "com.mysql.cj.jdbc.Driver";

		String id = "root";

		String pwd = "mcys1309";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pwd);

		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void closeConnection(Connection con, Statement stmt, ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
