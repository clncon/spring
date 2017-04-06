package cn.itcast.strust2_spring.test;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.strust2_spring.listen.myEvent;
import cn.itcast.strust2_spring.service.UserService;

public class ServiceTest {
	
	   @Test
	   public void TestSaveUser(){
		   ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		   UserService service =  (UserService) ac.getBean("userService");
		  service.saveUser();
		 
	   }
	   
	   @Test
	   public void TestEvent(){
		   ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		       System.out.println(ac);
		       
		       ac.refresh();
		       System.out.println(ac);
		       
		   
		        ac.close();
	   }
	   
	     //测试事件
	   @Test
	   public void test(){
		   ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
               ac.publishEvent(new myEvent("事件源")); 		   
	   }

}
