package mc.ys.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMain {

	public static void main(String[] args) {

		DatabaseMain dm = new DatabaseMain();
//		dm.testConnection();
//		dm.testQuery();
		dm.testCRUD();
		
	}
	
	public void testCRUD() {
		EmpDAO dao = new EmpDAO();
		dao.testQueryWithVO();
//		try {
//			//dao.testInsertV2();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
	}
	



}