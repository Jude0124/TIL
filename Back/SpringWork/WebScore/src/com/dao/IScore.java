package com.dao;

public interface IScore {     
	   String insert_score ="insert into myscore  values(?,?,?,?,?,?,?)";
	   String delete_score="delete from myscore  where name=?";
	   String find_score="select name, kor,eng,mat,tot, avg, grade from myscore  where  name=?";
	   String update_score="update myscore set kor=?, mat=?, eng=?,"
	   		+ " tot =?, avg=?, grade=? "
	   		+ " where  name=?  ";
	   String select_score="select * from myscore"; 
	
}

