package cn.itcast.spring.f_beanScope;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainTest {
      private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml",this.getClass());
      
      //测试单例
      @Test
     public void test(){
    	 System.out.println("是在调用getBean之前-------------------");
    	 User user1 = (User) ac.getBean("user1");
    	 User user2 = (User) ac.getBean("user1");
    	 
    	 System.out.println(user1==null);//false
    	 System.out.println(user1==user2);//true
     }
      
      //测试多例
      @Test
      public void test2(){
    	  
    	  System.out.println("是在调用Bean之前-----------------------------");
    	  User user1 = (User) ac.getBean("user2");
           User user2 = (User) ac.getBean("user2");
           
           
           System.out.println(user1==null);//false
           System.out.println(user1==user2);//false
      }
}
