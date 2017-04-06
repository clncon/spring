package cn.itcast.hibernate.hibernate_temple_3;

import org.hibernate.Session;

public interface HibernateCallBack {
	
	 public Object doInSession(Session session);

}
