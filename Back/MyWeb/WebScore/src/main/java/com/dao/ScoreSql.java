package com.dao;

public interface ScoreSql {
	String Score_selectAll = "select * from Score";
	String Score_insert = "insert into score values(?,?,?,?,?,?,?)";
	String Score_find = "select * from Score where name=?";
	String Score_update = "update Score set kor=?, eng=?, mat=? where name=?";
	String Score_delete = "delete from score where name=?";
}
