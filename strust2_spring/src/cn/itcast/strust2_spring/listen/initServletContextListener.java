package cn.itcast.strust2_spring.listen;

import java.awt.Event;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.itcast.strust2_spring.service.UserService;

public class initServletContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
	     //做一些初始化工作，怎么拿到service对象，从spring的ioc容器中拿
		
		 ApplicationContext ac =//
				 WebApplicationContextUtils.getWebApplicationContext//
				 (sce.getServletContext());//
		 
		    UserService userservice =  (UserService) ac.getBean("userService");
		    
		     
		    System.out.println("InitServletContextListener.contextInitialized() --->"+userservice);
		
	}
	
	 

}
