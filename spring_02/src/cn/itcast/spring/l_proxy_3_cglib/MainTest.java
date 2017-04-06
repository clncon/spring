package cn.itcast.spring.l_proxy_3_cglib;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		UserService userservice = new UserService();
		userservice = new logCglibProxy(userservice).createProxyInstance();
		
		
		userservice.fool4();
		System.out.println();
		userservice.fool5();
		System.out.println();
		
		userservice.fool1();
		System.out.println();
		userservice.fool2();
		System.out.println();
		
		
		userservice.saveUser();
		System.out.println();
		userservice.deleteUser();
		System.out.println();
		userservice.queryUser();
	}

}
