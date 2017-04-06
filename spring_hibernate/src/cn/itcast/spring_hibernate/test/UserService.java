package cn.itcast.spring_hibernate.test;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.spring_hibernate.entity.User;

@Service
public class UserService {
	
	   @Resource
	 private SessionFactory sessionFactory;
	 
	    //�����transactional���Զ���Ϊ����ע��session
	 @Transactional
	 public void saveTwoUser(){
		 Session session = 
				 
				 sessionFactory.getCurrentSession();
		 
		 session.save(new User());
		 
		  //int i =10/0;//���л����쳣
		  session.save(new User());
		 
	 }
	

}
