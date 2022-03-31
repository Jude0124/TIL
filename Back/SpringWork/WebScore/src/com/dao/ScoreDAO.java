package com.dao;

import java.sql.*;
import com.vo.*;
import com.entity.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ScoreDAO implements IScore {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<ScoreEntity> getAllScore() {
		List<ScoreEntity> all = jdbcTemplate.query(select_score, 
				( rs, rownum ) -> {
				ScoreEntity score = new ScoreEntity(
						rs.getString("name"), 
						rs.getInt("kor"), 
						rs.getInt("eng"),
						rs.getInt("mat"), 
						rs.getInt("tot"), 
						rs.getDouble("avg"), 
						rs.getString("grade")
				);
				return score;
		});
		return all;
	}

	public int getDelScore(String del_name) {
		int r = jdbcTemplate.update(delete_score, del_name);
		return r;
	}

	////////////////// input
	public int getInsertScore(ScoreEntity se) {
		
		return jdbcTemplate.update(insert_score,new Object[] {se.getName(), se.getKor(),se.getMat(),
				se.getEng(),se.getTot(),se.getAvg(),se.getGrad()});
	}

	// find는 queryForObject => == select와 같다.
	public ScoreEntity getFindScore(String find_name) {
		ScoreEntity entity = jdbcTemplate.queryForObject(find_score,
				( rs, num ) -> {
					ScoreEntity score = new ScoreEntity(
							rs.getString("name"), 
							rs.getInt("kor"), 
							rs.getInt("eng"),
							rs.getInt("mat"), 
							rs.getInt("tot"), 
							rs.getDouble("avg"), 
							rs.getString("grade"));
					return score;}, find_name );
		return entity;
	}

	public int getUpdateScore(ScoreEntity se) {           
		return jdbcTemplate.update(update_score,new Object[] {se.getKor(),se.getMat(),
				se.getEng(),se.getTot(), se.getAvg(),se.getGrad(), se.getName()});
	}
}
