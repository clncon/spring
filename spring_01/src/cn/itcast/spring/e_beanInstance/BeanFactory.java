package cn.itcast.spring.e_beanInstance;

import cn.itcast.spring.b_springhelloWorld.UserDao;
import cn.itcast.spring.b_springhelloWorld.UserDaoImpl;

public class BeanFactory {
	
	 /**
	  * �Ǿ�̬�ķ�ʽ����UserDao�Ĺ���
	  * @return
	  */
	public UserDao createUserDao(){
		System.out.println("beanFactory:createUserDao");
		return new UserDaoImpl();
	}

}
