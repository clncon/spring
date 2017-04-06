package cn.itcast.spring_03.q_tx;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {
	
	
	  @Resource
	 private UserDao userdao;
	   @Resource
	 private logDao logdao;
	   
	  // @Transactional( noRollbackFor = ArithmeticException.class,propagation=Propagation.REQUIRED)
	   
	   @Transactional(propagation=Propagation.REQUIRED)
	   public void saveTwoUser(){
		   
		   String name = "测试_"+System.currentTimeMillis();
		   
		    userdao.saveUser(name);
		    
		     
		     logdao.logTODB("插入了第一个User_"+System.currentTimeMillis());
		     int a = 10/0;
		     
		     userdao.saveUser(name);
		     
		     
		     
		      logdao.logTODB("插入了第二个User_"+System.currentTimeMillis());
		     
	   }

}
