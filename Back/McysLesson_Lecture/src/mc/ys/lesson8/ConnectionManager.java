package mc.ys.lesson8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	public Connection getConnection() {
		Connection con = null;
		//서버접속에 필요한 정보
		String url = "jdbc:mysql://localhost:3306/sqldb";
		//접속한 뒤에 작업을 하기 위해 필요한 라이브러리 클래스
		String driver = "com.mysql.cj.jdbc.Driver";
	
		// 아이디
		String id = "root";
		
		//비번
		String pwd = "mcys1309";
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,id,pwd);
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
