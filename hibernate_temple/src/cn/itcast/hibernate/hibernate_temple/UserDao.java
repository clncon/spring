package cn.itcast.hibernate.hibernate_temple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.itcast.hibernate.domain.User;

public class UserDao {
	
	 private SessionFactory sessionfactory = new Configuration().//
			 configure().//
			 buildSessionFactory();//

	 
	 public void SaveUser(User user){
		 
		 Session session = sessionfactory.openSession();
		 Transaction tx=null;
		 
		 try {
			 tx = session.beginTransaction();
			 session.save(user);//²Ù×÷
			 tx.commit();
		 } catch (Exception e) {
			 tx.rollback();	  
			 throw new RuntimeException();
		 }
		 
		 
	 }
	 
	 public void UpdateUser(User user){
		 
		 Session session = sessionfactory.openSession();
		 Transaction tx=null;
		 
		 try {
			 tx = session.beginTransaction();
			 session.update(user);//²Ù×÷
			 tx.commit();
		 } catch (Exception e) {
			 tx.rollback();	  
			 throw new RuntimeException();
		 }
		 
		 
	 }
}
