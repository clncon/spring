package cn.itcast.spring.g_bean_init_destory;

import javax.sql.DataSource;

public class UserDao {
	
	 private DataSource datasource;
	 
	   /**
	    * 初始化方法
	    */
	 public void init(){
		 System.out.println("UserDao:init()");
	 }
	 /**
	  *  销毁的方法
	  */
	 public void destroy(){
		 System.out.println("UserDao:destory()");
	 }

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	 
	 
     

}
