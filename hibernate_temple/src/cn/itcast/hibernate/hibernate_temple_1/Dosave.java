package cn.itcast.hibernate.hibernate_temple_1;

import org.hibernate.Session;

import cn.itcast.hibernate.domain.User;
import cn.itcast.hibernate.hibernate_temple.HibernateUtils;


 /**
  * 这样做的坏处，在与只能处理所有的和save有关的方法，而不能处理所有的方法
  * @author Administrator
  *
  */
public abstract class Dosave {
	
	
	 /**
	  *保存实例
	  * @param user
	  */
	public void save(User user){
		
		 Session session = HibernateUtils.openSession();
		 
		 try {
			session.beginTransaction();
			DoSave(session, user);
			session.getTransaction().commit();
		} catch (Exception e) {
			 session.getTransaction().rollback();
			throw new RuntimeException();
			
			// TODO: handle exception
		}
	}

	public abstract void DoSave(Session session, User user);
		
		

}
