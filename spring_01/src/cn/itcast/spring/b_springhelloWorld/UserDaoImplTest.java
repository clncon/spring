package cn.itcast.spring.b_springhelloWorld;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoImplTest {

	@Test
	public void testGetUserDao() {
		//����Spring����
		ApplicationContext application = new //
				ClassPathXmlApplicationContext//
				("cn/itcast/spring/b_springhelloWorld/applicationContext.xml");
		
		//ȡ��UserDaoheService��Bean����
		UserDao userdao = (UserDao) application.getBean("UserDao");
		UserServiceImpl userservice = (UserServiceImpl) application.getBean("userService");
		
		  //��ӡ��Ϣ
		  System.out.println(userdao);
		  System.out.println(userservice);
		 System.out.println("--------------------------");
		  userdao.printInfo();
		  System.out.println(userservice.getUserdao());
	}

}
