package cn.itcast.strust2_spring.listen;

import javax.servlet.ServletContext;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;


@Component
public class InitApplicatonContextListener implements ApplicationListener<ApplicationEvent>,ServletContextAware{

	
	  private ServletContext application;
	  @Override
	  public void setServletContext(ServletContext application) {
		  // TODO Auto-generated method stub
		  this.application=application;
		  
	  }
	  /**
	   * 用于做初始化的spring事件监听器
	   */
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		 System.out.println("事件出发了=======>"+event.getClass());
		 
		 if(event instanceof ContextRefreshedEvent){
			  System.out.println("做初始化操作========>");
			  System.out.println("放入到applictionz中=====>"+application);
			 
		 }
		
	}

	
	
}
