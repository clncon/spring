package cn.itcast.spring.b_springhelloWorld;

import java.io.InputStream;
import java.util.Properties;

public class UserDaoImpl implements UserDao{
	
	private String driverClass;
	private String driverUrl;
	private String username;
	private String password;
	
	

	

	public String getDriverClass() {
		return driverClass;
	}





	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}





	public String getDriverUrl() {
		return driverUrl;
	}





	public void setDriverUrl(String driverUrl) {
		this.driverUrl = driverUrl;
	}





	public String getUsername() {
		return username;
	}





	public void setUsername(String username) {
		this.username = username;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	@Override
	public void printInfo() {
		System.out.println(this.getDriverClass());
		System.out.println(this.getDriverUrl());
		System.out.println(this.getUsername());
		System.out.println(this.getPassword());
		
	}
	
	

}
