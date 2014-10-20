package com.student.registration.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.registration.model.User;

public class UserServiceTest {

	@Test
	public void testExists() throws Exception {
		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("cofig/ApplicationContext.xml");
//		UserDao userDao = (UserDao) ctx.getBean("userDao");
		UserService um = (UserService) ctx.getBean("UserServiceImpl");
		User u = new User();
		u.setUsername("admin1");
		u.setPassword("aaa");
		boolean exists = um.exists(u);
		Assert.assertEquals(true,exists);   //执行测试的预期结果与实际结果是否符合
		//fail("Not yet implemented");
	}

	@Test
	public void testAddUser() throws Exception {
		String username = "username12";
		String password = "password_2";
		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("cofig/ApplicationContext.xml");
		UserService um = (UserService) ctx.getBean("UserServiceImpl");
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		if(!um.exists(u)){
			um.add(u);
			u.setUsername(username);
			u.setPassword(password);
			boolean exists = um.exists(u);
			Assert.assertEquals(true,exists);   //执行测试的预期结果与实际结果是否符合
		}
		else
			Assert.fail("not added");
		//fail("Not yet implemented");
	}
	
	@Test
	public void testgetUsers() throws Exception {
		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("cofig/ApplicationContext.xml");
		UserService um = (UserService) ctx.getBean("UserServiceImpl");
		List<User> users = um.getUsers();
		for(int i = 0;i<users.size();i++)
			System.out.println(users.get(i).getUsername());
//		Assert.assertEquals(true,exists);   //执行测试的预期结果与实际结果是否符合
		//fail("Not yet implemented");
	}

}
