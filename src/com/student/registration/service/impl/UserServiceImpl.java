package com.student.registration.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.student.registration.dao.UserDao;
import com.student.registration.model.User;
import com.student.registration.service.UserService;

@Component("UserServiceImpl")
public class UserServiceImpl implements UserService{
	
	private UserDao userDao; 
	
	public UserDao getUserDao() {
		return userDao;
	}

	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public boolean exists(User u) throws Exception{
		return userDao.CheckUserExistsByName(u.getUsername());
	}
	
	@Override
	public void add(User u) throws Exception{
		userDao.save(u);
	}
	
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return this.userDao.getUsers();
	}
	
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
//		return this.userDao.LoadUserById(id);
		return null;
	}
	
	
}
