package cn.itcast.spring.d_applicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.spring.b_springhelloWorld.UserDao;

public class applicationContextTest {
	
	
	@Test
	public void test1(){
	     ApplicationContext application = //
	    		 new ClassPathXmlApplicationContext//
	    		 ("cn/itcast/spring/d_applicationContext/applicationContext_userdao.xml");
	     ApplicationContext application2= //
	    		               new ClassPathXmlApplicationContext//
	    		               ("applicationContext_userdao.xml",this.getClass());
	     System.out.println(application.getBeanDefinitionCount());
	     System.out.println(Arrays.toString(application.getBeanDefinitionNames()));
	     System.out.println("-----------------------------------------------------------");
	     System.out.println(application2.getBeanDefinitionCount());
	     System.out.println(Arrays.toString(application2.getBeanDefinitionNames()));
	}
   
	
	 //һ�μ��ض�������ļ�
	   @Test
	  public void test2(){
		  ApplicationContext application = new ClassPathXmlApplicationContext(new String[]{
	       "cn/itcast/spring/d_applicationContext/applicationContext_userdao.xml",//
	       "cn/itcast/spring/d_applicationContext/applicationContext_service.xml"	  
		  });
		  
	     System.out.println(application.getBeanDefinitionCount());
	     System.out.println(Arrays.toString(application.getBeanDefinitionNames()));
		 System.out.println("-----------------------------------------------------------------");
		 
		 ApplicationContext application2 = new ClassPathXmlApplicationContext(new String[]{
				 
				 "applicationContext_service.xml",//
				 "applicationContext_userdao.xml"
		 },this.getClass());
		 
		   System.out.println(application2.getBeanDefinitionCount());
		   System.out.println(Arrays.toString(application2.getBeanDefinitionNames()));
	  }
	  
	   @Test
	   public void testMethod(){
		   
		   ApplicationContext ac = new ClassPathXmlApplicationContext//
				              ("cn/itcast/spring/d_applicationContext/applicationContext_userdao.xml");
		     //��ȡָ�������͵�bean������
		     String[]  names = ac.getBeanNamesForType(UserDao.class);
		     System.out.println(Arrays.toString(names));
		     
		     //��ȡָ�������͵�bean����Ϣ
		     Map<String, UserDao> map = ac.getBeansOfType(UserDao.class);
		     System.out.println(map);
		     
	   }
}
