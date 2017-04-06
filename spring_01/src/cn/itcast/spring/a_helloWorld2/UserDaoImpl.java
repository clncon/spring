package cn.itcast.spring.a_helloWorld2;

import cn.itcast.spring.a_helloWorld.UserDao;

public class UserDaoImpl {
     
	private UserDao userdao = BeanFactory.getBeanInstance(UserDao.class);
	
	public UserDaoImpl(){
		
		System.out.println(userdao.getClass());
	}
}
