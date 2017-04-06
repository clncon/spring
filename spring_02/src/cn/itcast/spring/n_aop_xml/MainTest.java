package cn.itcast.spring.n_aop_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.oa.service.RoleService;

public class MainTest {
   
	
	 //使用xml的方式来实现aop编程
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml",this.getClass());
		 UserServiceImpl userservice = (UserServiceImpl) ac.getBean("userservice");
	//====================================================================================
		 
		 System.out.println(userservice.getClass());
		 System.out.println("======================================================================");
		  userservice.deleteUser();
		  System.out.println();
		  userservice.queryUser();
		  System.out.println();
		  userservice.saveUser();
		  System.out.println();
		  
		 
	}
	@Test
	public void testRole() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml",this.getClass());
	     RoleService  roleservice = (RoleService) ac.getBean("roleService");
		//====================================================================================
		
		System.out.println(roleservice.getClass());
		System.out.println("======================================================================");
		roleservice.deleteUser();
		System.out.println();
		roleservice.queryUser();
		System.out.println();
		roleservice.saveUser();
		System.out.println();
		
		
	}

}
