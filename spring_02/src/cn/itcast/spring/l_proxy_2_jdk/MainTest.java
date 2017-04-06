package cn.itcast.spring.l_proxy_2_jdk;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		 UserService userservice = new UserServiceImpl();
		 logJdkProxy ljp = new logJdkProxy(userservice);//ʹ��jdk�Ķ�̬����(����Ҫÿ��������Ķ���Ҫʵ�ֽӿ�)
		 UserService userserviceProxy = (UserService) ljp.createProxyInstance();
		 
		 userserviceProxy.saveUser();
		 System.out.println();
		 userserviceProxy.queryUser();
		 System.out.println();
		 userserviceProxy.deleteUser();
		 System.out.println();
	}

}
