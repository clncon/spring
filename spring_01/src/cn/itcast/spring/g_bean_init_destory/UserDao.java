package cn.itcast.spring.g_bean_init_destory;

import javax.sql.DataSource;

public class UserDao {
	
	 private DataSource datasource;
	 
	   /**
	    * ��ʼ������
	    */
	 public void init(){
		 System.out.println("UserDao:init()");
	 }
	 /**
	  *  ���ٵķ���
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
