package cn.itcast.spring.e_beanInstance;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.spring.b_springhelloWorld.UserDao;

public class createInstanceTest {
	
	@Test
   public void test(){
		ApplicationContext ac = new //
				ClassPathXmlApplicationContext//
				("applicationContext.xml",this.getClass());
		
		  //取得对象
		  UserDao userdao1 = (UserDao) ac.getBean("UserDao");
		  UserDao userdao2 = (UserDao) ac.getBean("UserDao2");
          UserDao userdao3 = (UserDao) ac.getBean("UserDao3");		  
		  //打印
		  System.out.println(userdao1);
		  System.out.println(userdao2);
		  System.out.println(userdao3);
	}

}
