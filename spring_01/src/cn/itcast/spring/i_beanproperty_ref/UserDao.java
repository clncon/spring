package cn.itcast.spring.i_beanproperty_ref;

public class UserDao {
	
	 private String datasource;//模拟一个数据源

	public String getDatasource() {
		return datasource;
	}

	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}
	 
	 public void SaveUser(Object object){
		 
		 System.out.println("UserDao.SaveUser");
	 }
	 

}
