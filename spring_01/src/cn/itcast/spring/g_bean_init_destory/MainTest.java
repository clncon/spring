package cn.itcast.spring.g_bean_init_destory;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	
	// ��ApplicationContext�ӿ���û�ж���close()������Ҫ����ã��͵���תΪ�������Ͳ��С�
		// һ��Ҫ���ApplicationContext����bean���õ����ٷ����Żᱻ���á�
		// �ڵ���ʱ�����õĳ�ʼ�������ٷ������ᱻ���á�
		// �ڶ���ʱ��ֻ�����õĳ�ʼ���Żᱻ���á�
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
