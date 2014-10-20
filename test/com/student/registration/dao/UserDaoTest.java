package com.student.registration.dao;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.registration.model.User;


public class UserDaoTest {
	
	@Test
	public void testInsertUser(){
		ApplicationContext ctx=null;
		ctx = new ClassPathXmlApplicationContext("cofig/ApplicationContext.xml");
		UserDao userDao = (UserDao) ctx.getBean("userDao");
		User u = new User();
		u.setUsername("admin4");
		u.setPassword("admin4");
		userDao.getUserMapper().insertUser(u);
	}
	
	
	public static void main(String[] args) {
		
//		System.out.println(userMapper.selectUser(u));
		//插入（去掉下面的注释进行调试）
		/*
		User insertUser=new User();
		insertUser.setUsername("testUsername");
		insertUser.setPassword("testPassword");
		userMapper.insertUser(insertUser);
		*/
		//更新（去掉下面的注释进行调试）
		/*
		u.setId(1);
		u.setPassword("updatePassword");
		userMapper.updateUser(u);
		*/
		//删除（去掉下面的注释进行调试）
		/*
		userMapper.deleteUser(9);
		*/
	}
}