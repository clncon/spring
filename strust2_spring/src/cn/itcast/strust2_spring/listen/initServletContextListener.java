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
	     //��һЩ��ʼ����������ô�õ�service���󣬴�spring��ioc��������
		
		 ApplicationContext ac =//
				 WebApplicationContextUtils.getWebApplicationContext//
				 (sce.getServletContext());//
		 
		    UserService userservice =  (UserService) ac.getBean("userService");
		    
		     
		    System.out.println("InitServletContextListener.contextInitialized() --->"+userservice);
		
	}
	
	 

}
