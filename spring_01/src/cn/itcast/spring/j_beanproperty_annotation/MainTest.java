package cn.itcast.spring.j_beanproperty_annotation;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	@Test
	public void test() {
		ApplicationContext ac = //
				new ClassPathXmlApplicationContext//
				("applicationContext.xml",this.getClass());
		
		
		  //String[] ArrayName = ac.getBeanDefinitionNames();
		  
		 // System.out.println(Arrays.toString(ArrayName));
		  
		    //UserService userService = (UserService) ac.getBean("userService");
		    
		   /* System.out.println(userService);
		    System.out.println(userService.getUserdao());
		    System.out.println("--------------------------------");
		    
		    UserDao userdao = (UserDao) ac.getBean("userDao");
		    System.out.println(userdao);
		    System.out.println(userService.getUserdao()==userdao);*/
		    
		    UserDao userdao2 = (UserDao) ac.getBean("userDao2");
		    System.out.println(userdao2);
		  
		  
	}
	@Test
	public void test2() {
		ApplicationContext ac = //
				new ClassPathXmlApplicationContext//
				("applicationContext.xml",this.getClass());
		
		/*UserDao userDao1 = (UserDao) ac.getBean("userDao");
		UserDao userDao2 = (UserDao) ac.getBean("userDao");
		
		System.out.println(userDao1 != null);
		System.out.println(userDao1 == userDao2);*/
		UserService us = (UserService) ac.getBean("userService");
		 us.getUserdao().SaveUser(new Object());
		
	}

}
