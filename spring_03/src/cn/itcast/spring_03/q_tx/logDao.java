package cn.itcast.spring_03.q_tx;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class logDao {
	
	  @Resource
	 private JdbcTemplate jdbcTemplate;

	   
	   /**
	    * 保存日志数据到数据库中
	    * @param message
	    */
	  @Transactional(propagation=Propagation.REQUIRES_NEW)
	   public void logTODB(String message){
		   
		    jdbcTemplate.update("insert into log(message)values(?)",message);
		   
	   }
}
