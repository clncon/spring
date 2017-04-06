package cn.itcast.hibernate.hibernate_temple_1;

import org.hibernate.Session;

import cn.itcast.hibernate.domain.User;
import cn.itcast.hibernate.hibernate_temple.HibernateUtils;


 /**
  * �������Ļ���������ֻ�ܴ������еĺ�save�йصķ����������ܴ������еķ���
  * @author Administrator
  *
  */
public abstract class Dosave {
	
	
	 /**
	  *����ʵ��
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
