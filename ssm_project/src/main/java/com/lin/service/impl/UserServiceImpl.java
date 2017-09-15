package com.lin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lin.bean.User;
import com.lin.dao.UserDao;
import com.lin.service.UserService;

@Service  

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao; 
	
	public List<User> selectUser() {
		return userDao.selectUser();  

	}

}
