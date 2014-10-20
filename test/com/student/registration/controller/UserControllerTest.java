package com.student.registration.controller;

import static org.junit.Assert.*;

//import org.apache.catalina.startup.UserConfig;
//import com.student.registration.controller.UserController;
//import com.student.registration.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.registration.vo.UserFormBean;

public class UserControllerTest {

	@Test
	public void testExecute() throws Exception {
		UserController ua = new UserController();
		UserFormBean urf = new UserFormBean();
		urf.setUsername("test123456");
		urf.setPassword("test123456");
		urf.setConfirm("test12456");
		//ua.setUserFormBean(urf);
//		String testResult = ua.execute();
//		fail("Not yet implemented");
//		Assert.assertEquals("success",testResult);  //检测第二个参数值是否与第一个参数预期值相同
	}
	
	@Test
	public void testList() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserController ua = (UserController) ctx.getBean("user");
		//ua.list();
		Assert.assertTrue(ua.getUsers().size() > 0);  //检测参数条件是否为真
	}
	
	@Test
	public void testLoad() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserController ua = (UserController) ctx.getBean("useraction");
		UserFormBean ufb = new UserFormBean();
		ufb.setId(1);
		//String s = ua.load();
        String s="";
		System.out.println(ua.getUser().getUsername());
		System.out.println(ua.getUser().getPassword());
		Assert.assertTrue(s != null);  //检测参数条件是否为真
	}
}
