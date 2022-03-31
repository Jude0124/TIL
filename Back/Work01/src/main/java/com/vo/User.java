package com.vo;

public class User {
  private String id;
  private String pw;
  
public User(String id, String pw) {
	super();
	this.id = id;
	this.pw = pw;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
}
