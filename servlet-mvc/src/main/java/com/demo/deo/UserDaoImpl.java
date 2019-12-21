package com.demo.deo;

import java.util.Arrays;
import java.util.List;

import com.demo.model.User;

public class UserDaoImpl implements UserDao{

	@Override
	public List<User> findUsers() {
		
		return Arrays.asList(new User(12l,"amiya"));
	}

}
