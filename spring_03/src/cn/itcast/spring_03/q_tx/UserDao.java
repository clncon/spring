package cn.itcast.spring_03.q_tx;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDao{

	
	  @Resource
	 private JdbcTemplate jdbcTempate;
	  
	   /**
	    * 保存一个指定用户名称的对象
	    * @param username
	    */
	  public void saveUser(String username){
		  
		   jdbcTempate.update("insert into user(name) values(?)", username);
	  }
}
