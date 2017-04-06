package cn.itcast.spring.j_beanproperty_annotation;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	  private String datasource;

	public String getDatasource() {
		return datasource;
	}

	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}
	  
	 public void SaveUser(Object obj){
		 
		 System.out.println("UserDao.SaveUser");
	 }

}
