package cn.itcast.spring.e_beanInstance;

import cn.itcast.spring.b_springhelloWorld.UserDao;
import cn.itcast.spring.b_springhelloWorld.UserDaoImpl;

public class StaticDaoFactory {
  
	/**
	 * static的工厂创建实例的方法
	 * @return
	 */
	 public static UserDao createUserDaoInstance(){
		 System.out.println("DaoFactory1:createUserDaoInstance");
		 return new UserDaoImpl();
	 }
}
