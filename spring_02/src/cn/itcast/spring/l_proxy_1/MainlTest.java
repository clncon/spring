package cn.itcast.spring.l_proxy_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainlTest {

	@Test
	public void test() {
		
		UserServiceImpl userservice = new UserServiceImpl();  
		UserService service = new UserServiceProxy(userservice);
		 //ʹ�þ�����װ��Ĵ������(����Ǿ�̬����ķ�ʽ)
		//ȱ��:��Ҫ�Զ����ÿ��������ʵ�ֶ�Ӧ�������
		
	     service.saveUser();
	     System.out.println();
	     service.deleteUser();
	     System.out.println();
	     service.queryUser();
	     System.out.println();
	}

}
