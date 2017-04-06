package cn.itcast.spring.a_helloWorld;

import java.io.InputStream;
import java.util.Properties;

public class UserDaoImpl implements UserDao{
	
	private String DiverClass;
	private String DiverUrl;
	private String username;
	private String password;
	
	public UserDaoImpl(){
		//读取并加载配置文件
		 String resource = "jdbc.properties";
		 Properties props = loadProperties(resource);
		 
		 //初始化配置文件
		 DiverClass = props.getProperty("DiverClass");
		 DiverUrl = props.getProperty("DiverUrl");
		 username = props.getProperty("username"); 
		 password = props.getProperty("password");
		  //打印配置信息
		  this.printInfo();
		
	}
	
	   /**
	    * 加载配置文件
	    * @param resource
	    * @return
	    */
    private Properties loadProperties(String resource) {
		Properties props = new Properties();
		try {
			 InputStream is = this.getClass().getResourceAsStream(resource);
			 props.load(is);
			
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return props;
	}

	public String getDiverClass() {
		return DiverClass;
	}

	public void setDiverClass(String diverClass) {
		DiverClass = diverClass;
	}

	public String getDiverUrl() {
		return DiverUrl;
	}

	public void setDiverUrl(String diverUrl) {
		DiverUrl = diverUrl;
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
		System.out.println(this.getDiverClass());
		System.out.println(this.getDiverUrl());
		System.out.println(this.getUsername());
		System.out.println(this.getPassword());
		
	}
	
	

}
