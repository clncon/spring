package cn.itcast.strust2_spring.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
	
	 public void saveUser(){
		 
		 System.out.println("UserDao.saveUser");
	 }

}
