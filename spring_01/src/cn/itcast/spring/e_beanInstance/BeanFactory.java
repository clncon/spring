package cn.itcast.spring.e_beanInstance;

import cn.itcast.spring.b_springhelloWorld.UserDao;
import cn.itcast.spring.b_springhelloWorld.UserDaoImpl;

public class BeanFactory {
	
	 /**
	  * 非静态的方式创建UserDao的工厂
	  * @return
	  */
	public UserDao createUserDao(){
		System.out.println("beanFactory:createUserDao");
		return new UserDaoImpl();
	}

}
