package cn.itcast.spring.a_helloWorld2;

import java.util.Properties;

import cn.itcast.spring.a_helloWorld.UserDao;

public class BeanFactory {
	
	private static Properties props = null;
	
	//模拟加载配置文件
	  static{
		  props = new Properties();
		  props.setProperty("UserDao", "cn.itcast.spring.a_helloWord.UserDaoImpl");
		  
	  }

	public static <T>T getBeanInstance(Class<T> clazz) {
		String UserDaoImplFullName =  props.getProperty(clazz.getSimpleName());
		 T t = null;
		 try {
			// System.out.println(UserDaoImplFullName);
			  t = (T)Class.forName(UserDaoImplFullName).newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		} 
		return t;
	}
	  
	 
}
