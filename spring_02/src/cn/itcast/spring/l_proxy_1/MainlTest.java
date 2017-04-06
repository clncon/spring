package cn.itcast.spring.l_proxy_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainlTest {

	@Test
	public void test() {
		
		UserServiceImpl userservice = new UserServiceImpl();  
		UserService service = new UserServiceProxy(userservice);
		 //使用经过包装后的代理对象(这就是静态代理的方式)
		//缺点:需要对对象的每个方法都实现对应处理代码
		
	     service.saveUser();
	     System.out.println();
	     service.deleteUser();
	     System.out.println();
	     service.queryUser();
	     System.out.println();
	}

}
