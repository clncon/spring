package cn.itcast.hibernate.hibernate_temple_3;

import java.util.List;

import org.hibernate.Session;

import cn.itcast.hibernate.domain.User;
import cn.itcast.hibernate.hibernate_temple.HibernateUtils;


 /**
  * 利用接口回调的方式可以避免无用的重复代码，提高效率
  * @author Administrator
  *
  */
public class UserDao {
	
	
	public void execute(HibernateCallBack action){
		
		 Session session = HibernateUtils.openSession();
		 
		 try {
			session.beginTransaction();
			 action.doInSession(session);
			session.getTransaction().commit();
		} catch (Exception e) {
			 session.getTransaction().rollback();
			throw new RuntimeException();
			
			// TODO: handle exception
		}
	}
	
	//保存
	public void SaveUser(User user){
		  execute(new HibernateCallBack(){

			@Override
			public Object doInSession(Session session) {
				  session.save(user);
				return null;
			}
			  
		  });
	}
	//更新
	public void UpdateUser(User user){
		execute(new HibernateCallBack(){
			
			@Override
			public Object doInSession(Session session) {
				session.update(user);
				return null;
			}
			
		});
	}
	//查询
	public void queryUser(Long id){
		execute(new HibernateCallBack(){
			
			@Override
			public Object doInSession(Session session) {
				List<User> list =(List<User>) session.get(User.class, id);
				return list;
			}
			
		});
	}

}
