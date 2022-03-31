package sample11;

import java.sql.*;
import javax.sql.*;
// spring + jdbc[ datasource] javax.sql

public class MemberDAO {
	
	private DataSource dataSource;

	public MemberDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDAO(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void Connection_Res() throws ClassNotFoundException, SQLException{
		Connection conn = dataSource.getConnection();
		System.out.println("연결성공");
		conn.close();
	}
	
	public int getInsert(MemberDTO dto) throws ClassNotFoundException, SQLException {
		Connection conn = dataSource.getConnection();
		String sql = "insert into springtest values(?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getId());
		pstmt.setString(3, dto.getJoindate());
		int res = pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		return res;
	}

}
