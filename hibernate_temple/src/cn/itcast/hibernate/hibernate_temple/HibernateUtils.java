package cn.itcast.hibernate.hibernate_temple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	 private static SessionFactory sessionfactory = new Configuration().//
			 configure().//
			 buildSessionFactory();//
	 
	 
	  public static Session openSession(){
		  return sessionfactory.openSession();
	  }


}
