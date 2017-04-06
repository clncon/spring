package cn.itcast.spring.g_bean_init_destory;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	
	// 在ApplicationContext接口中没有定义close()方法，要想调用，就得先转为子类类型才行。
		// 一定要半闭ApplicationContext，给bean配置的销毁方法才会被调用。
		// 在单例时，配置的初始化与销毁方法都会被调用。
		// 在多例时，只有配置的初始化才会被调用。
	@Test
	public void test() {
		ClassPathXmlApplicationContext cac = new//
				ClassPathXmlApplicationContext//
				("cn/itcast/spring/g_bean_init_destory/applicationContext.xml");
		
		UserDao userdao = (UserDao) cac.getBean("UserDao");
		System.out.println(userdao);
		
		
		cac.close();
	}

}
