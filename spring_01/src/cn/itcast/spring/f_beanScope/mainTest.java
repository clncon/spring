package cn.itcast.spring.f_beanScope;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainTest {
      private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml",this.getClass());
      
      //���Ե���
      @Test
     public void test(){
    	 System.out.println("���ڵ���getBean֮ǰ-------------------");
    	 User user1 = (User) ac.getBean("user1");
    	 User user2 = (User) ac.getBean("user1");
    	 
    	 System.out.println(user1==null);//false
    	 System.out.println(user1==user2);//true
     }
      
      //���Զ���
      @Test
      public void test2(){
    	  
    	  System.out.println("���ڵ���Bean֮ǰ-----------------------------");
    	  User user1 = (User) ac.getBean("user2");
           User user2 = (User) ac.getBean("user2");
           
           
           System.out.println(user1==null);//false
           System.out.println(user1==user2);//false
      }
}
