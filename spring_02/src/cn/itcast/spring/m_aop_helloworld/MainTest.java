package cn.itcast.spring.m_aop_helloworld;

import org.junit.Test;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class MainTest {

	@Test
	public void test() {
		
		 //创建要处理的对象
		 UserService userservice = new UserServiceImpl();
		 //=============================================================
		 
		  //创建一个切入点
		 NameMatchMethodPointcut pointcut = new NameMatchMethodPointcut();
		 
		  //声明要拦截哪些方法
		 
		 pointcut.addMethodName("save*");
		 pointcut.addMethodName("delete*");
		 
		 //创建一个通知，表示对象拦截的方法进行的处理
		 
		   logAdvice logadvice = new logAdvice();
		  
		//将切入点和通知组装成一个切面
		    Advisor advisor = new DefaultPointcutAdvisor//
		    		(pointcut, logadvice);
		    
		    //为原对象生成一个代理对象
		    ProxyFactory proxyfactory = new ProxyFactory();
		    
		      //添加一个切面
		        proxyfactory.addAdvisor(advisor);
		        //设置被代理的目标对象
		        proxyfactory.setTarget(userservice);
		        
		        //生成代理对象
		        
		        userservice = (UserService) proxyfactory.getProxy();
		        
		        
		//===============================================================================
		        
		    //使用代理对象
		        
		        userservice.deleteUser();
		        System.out.println();
		        userservice.saveUser();
		        System.out.println();
		        userservice.queryUser();
		        System.out.println();
		
	}

}
