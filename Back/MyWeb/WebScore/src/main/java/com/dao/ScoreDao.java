package com.dao;

import static com.common.JdbcTemplate.close;
import static com.common.JdbcTemplate.commit;
import static com.common.JdbcTemplate.rollback;

//import java.sql.Connection; //connection 객체
//JdbcTemplate의 모든 메소드가 static 이기 때문에
//import static으로 사용하면 메소드만 호출하면 된다.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
// List<>
import java.util.ArrayList;
import java.util.List;

// entity
import com.entity.Score;

//Insert, Delete, Update, Select, Find 메소드
public class ScoreDao implements ScoreSql {

	Connection con;

	public ScoreDao(Connection con) {
		this.con = con;
	}

	public List<Score> getScoreAll() {

		// String sql = "select * from Score";
		Score myscore = null; // select 의 결과를 한줄씩 담을 객체

		List<Score> all = new ArrayList<Score>();
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// select한 결과를 rs로 리턴
			stmt = con.createStatement();
			rs = stmt.executeQuery(Score_selectAll);

			while (rs.next()) {

				// entity 객체를 생성해서 데이터를 한 줄씩 읽어담아 list에 추가한다.
				// myscore = new Score();
				// myscore.setName(rs.getString(1));
				// myscore.setKor(rs.getInt(2));
				// myscore.setEng(rs.getInt(3));
				// myscore.setMat(rs.getInt(4));
				myscore = new Score(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
				// List 객체에 저장
				all.add(myscore);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
		}
		return all;
	}// getScoreAll()

	public int getScoreInsert(Score my_score) {
		PreparedStatement pstmt = null;
		int res = 0; // insert 결과 변수

		try {
			pstmt = con.prepareStatement(Score_insert);
			pstmt.setString(1, my_score.getName());
			pstmt.setInt(2, my_score.getKor());
			pstmt.setInt(3, my_score.getEng());
			pstmt.setInt(4, my_score.getMat());

			pstmt.setInt(5, my_score.getTot());
			pstmt.setDouble(6, my_score.getAvg());
			pstmt.setString(7, my_score.getGrade());

			res = pstmt.executeUpdate();

			if (res > 0) {
				commit(con);
			} 
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return res;
	}

	public int getScoreDelete(String name) {
		PreparedStatement pstmt = null;
		int res = 0; // delete 결과 변수

		try {
			pstmt = con.prepareStatement(Score_delete);
			pstmt.setString(1, name);
			res = pstmt.executeUpdate();

			if (res > 0) {
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return res;
	}
//select <-> Find	
	public Score getScoreFind(String name) {


		Score myscore = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = con.prepareStatement(Score_find);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				myscore = new Score(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return myscore;
	}// getScoreFind()

	public int getScoreUpdate(Score my_score) {
		PreparedStatement pstmt = null;
		int res = 0; // update 결과 변수

		try {
			pstmt = con.prepareStatement(Score_update);

		
			pstmt.setInt(1, my_score.getKor());
			pstmt.setInt(2, my_score.getEng());
			pstmt.setInt(3, my_score.getMat());
			pstmt.setString(4, my_score.getName());
			
			res = pstmt.executeUpdate();

			if (res > 0) {
				commit(con);
			} 
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return res;
	}

}// class
