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
		   
		   String name = "����_"+System.currentTimeMillis();
		   
		    userdao.saveUser(name);
		    
		     
		     logdao.logTODB("�����˵�һ��User_"+System.currentTimeMillis());
		     int a = 10/0;
		     
		     userdao.saveUser(name);
		     
		     
		     
		      logdao.logTODB("�����˵ڶ���User_"+System.currentTimeMillis());
		     
	   }

}
