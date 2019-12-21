package com.demo.service;

import java.util.List;

import com.demo.deo.UserDaoImpl;
import com.demo.model.User;

public class UserServiceImpl implements UserService {
	UserDaoImpl userDao;

	public UserServiceImpl() {
		this.userDao = new UserDaoImpl();
	}

	@Override
	public List<User> getAllUsers() {

		return userDao.findUsers();
	}

}
