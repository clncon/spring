package cn.itcast.spring.m_aop_helloworld;

import org.junit.Test;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class MainTest {

	@Test
	public void test() {
		
		 //����Ҫ����Ķ���
		 UserService userservice = new UserServiceImpl();
		 //=============================================================
		 
		  //����һ�������
		 NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		 
		  //����Ҫ������Щ����
		 
		 pointcut.addMethodName("save*");
		 pointcut.addMethodName("delete*");
		 
		 //����һ��֪ͨ����ʾ�������صķ������еĴ���
		 
		   logAdvice logadvice = new logAdvice();
		  
		//��������֪ͨ��װ��һ������
		    Advisor advisor = new DefaultPointcutAdvisor//
		    		(pointcut, logadvice);
		    
		    //Ϊԭ��������һ���������
		    ProxyFactory proxyfactory = new ProxyFactory();
		    
		      //���һ������
		        proxyfactory.addAdvisor(advisor);
		        //���ñ������Ŀ�����
		        proxyfactory.setTarget(userservice);
		        
		        //���ɴ������
		        
		        userservice = (UserService) proxyfactory.getProxy();
		        
		        
		//===============================================================================
		        
		    //ʹ�ô������
		        
		        userservice.deleteUser();
		        System.out.println();
		        userservice.saveUser();
		        System.out.println();
		        userservice.queryUser();
		        System.out.println();
		
	}

}
