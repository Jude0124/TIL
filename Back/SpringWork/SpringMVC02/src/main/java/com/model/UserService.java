package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public List<User> listUser(){
		return userDao.listUser();
	}
	
	public boolean insertUser(User user) {
		return userDao.insertUser(user);
	}
}
