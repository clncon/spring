package cn.itcast.spring.i_beanproperty_ref;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	@Test
	public void test() {
		ApplicationContext ac =
                 new ClassPathXmlApplicationContext
                 ("applicationContext.xml",this.getClass());
		
	         UserDao userdao = (UserDao) ac.getBean("UserDao");
	         UserService userservice = (UserService) ac.getBean("userService2");
	         System.out.println(userdao);
	         System.out.println(userservice);
	         System.out.println("------------------------------------------------------");
	         System.out.println(userservice.getUserdao());
	         System.out.println(userservice.getUserdao()==userdao);
	}

}
