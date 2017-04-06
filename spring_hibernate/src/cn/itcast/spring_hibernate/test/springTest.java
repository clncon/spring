package cn.itcast.spring_hibernate.test;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class springTest {
	
	 @Resource
	 private UserService2 userservice2;
	 @Resource
	 private UserService userservice;
	 @Resource
	private SessionFactory sessionFactory3;
	@Test
	public void testSessionFactory(){
		System.out.println("------->"+sessionFactory3.getClass());
	}

	   //测试事务
	   @Test
	 public void testTransactional(){
		   userservice.saveTwoUser();
		 
	 }
	   //测试事务
	   @Test
	   public void testTransactional2(){
		   userservice2.saveTwoUser();
		   
	   }
}
