package com.student.registration.mapper;


import java.util.List;

import org.springframework.stereotype.Component;

import com.student.registration.model.User;

@Component("userMapper")
public interface UserMapper{
	
	public User selectUser(User user);
    public void insertUser(User user);  
    public void updateUser(User user);  
    public void deleteUser(int userId);
    public User selectUserByUsername(String username);
    public List<User> selectUsername();
	
}
