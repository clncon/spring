package cn.itcast.spring.h_beanproperty;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest extends User {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml",this.getClass());
		User user1 = (User) ac.getBean("user1");
	    User user2 = (User) ac.getBean("user2");
	    
	    //¥Ú”°
	    System.out.println(user1.toString());
	    System.out.println(user2.toString());
		
	} 
	@Test
	public void test2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml",this.getClass());
		User user3 = (User) ac.getBean("user3");
		
		//¥Ú”°
		//System.out.println(user3.getAddressSet());
		//System.out.println(user3.getNumberSet());
		//System.out.println(user3.getNumberSet().iterator().next().getClass());
		 //System.out.println(user3.getAddressList());
		  //System.out.println(user3.getAddressMap());
		//System.out.println(Arrays.toString(user3.getAddressArray()));
		  System.out.println(user3.getProps());
		
	}
	@Test
	public void testParent() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml",this.getClass());
		
		
		  UserDao userdao = (UserDao) ac.getBean("UserDao");
		  RoleDao roledao = (RoleDao) ac.getBean("RoleDao");
		  
		  System.out.println(userdao.getDatasource());
		  System.out.println(roledao.getDatasource());
		
	}

}
