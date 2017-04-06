package cn.itcast.spring.k_placeholder;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	 @Test
	public void test(){
		 
		 ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml",this.getClass());
		 
		 UserDaoImpl udl = (UserDaoImpl) ac.getBean("UserDao");
		 
		 udl.printInfo();
	 }

}
