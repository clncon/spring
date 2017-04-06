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
	   * ��������ʼ����spring�¼�������
	   */
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		 System.out.println("�¼�������=======>"+event.getClass());
		 
		 if(event instanceof ContextRefreshedEvent){
			  System.out.println("����ʼ������========>");
			  System.out.println("���뵽applictionz��=====>"+application);
			 
		 }
		
	}

	
	
}
