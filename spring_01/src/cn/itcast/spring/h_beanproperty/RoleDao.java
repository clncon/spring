package cn.itcast.spring.h_beanproperty;

public class RoleDao {
	
	private  String datasource;

	public String getDatasource() {
		return datasource;
	}

	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}
	
	public void SaveRole(){
		System.out.println("RoleDao.SaveRole");
		
	}

}
