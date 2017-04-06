package cn.itcast.spring.o_aop_annotation;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl {

	
	 public UserServiceImpl() {
	 }

	public List<String> queryUser() {
		System.out.println(">==queryUser==<");
		return new ArrayList<String>();
	}

	
	public void saveUser() {
		System.out.println(">==saveUser==<");
	}

	public void deleteUser() {
		System.out.println(">==deleteUser==<");
		
		
	}

}
