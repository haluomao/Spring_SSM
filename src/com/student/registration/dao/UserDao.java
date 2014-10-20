package com.student.registration.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.student.registration.mapper.UserMapper;
import com.student.registration.model.User;

@Component("userDao")
public class UserDao {

	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Resource(name="userMapper")
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	public void save(User user){
		userMapper.insertUser(user);
	}
	
	public boolean CheckUserExistsByName(String username){
//		User user = new User();
//		user.setUsername(username);
		User u = userMapper.selectUserByUsername(username);
		if(u!=null)
			return true;
		return false;
	}
	
	public List<User> getUsers(){
		return userMapper.selectUsername();
	}
	
	
	
	

}
