package cn.itcast.spring_hibernate.test;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.ServletContextAware;

import cn.itcast.spring_hibernate.entity.User;

@Service
public class UserService2 implements ApplicationContextAware{
	
	
	  @Resource
	 private HibernateTemplate hibernateTemplate;
	  
	  
	  @Transactional
	public void saveTwoUser(){
//	hibernateTemplate.execute(new HibernateCallback<User>() {
//
//			@Override
//			public User doInHibernate(Session session) throws HibernateException, SQLException {
//				   session.save(new User());
//				return null;
//			}
//			
//			
//		});
//		
		
		 hibernateTemplate.save(new User());
		  int i=10/0;
		  
		  hibernateTemplate.save(new User());
		  
		  
	}

      private ApplicationContext ac;
	@Override
	public void setApplicationContext(ApplicationContext application) throws BeansException {
	     
		 this.ac=application;
		 System.out.println("◊¢»Î¡ÀapplicationContext");
		
	}
	  
	  

}
