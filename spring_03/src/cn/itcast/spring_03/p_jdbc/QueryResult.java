package cn.itcast.spring_03.p_jdbc;

import java.util.List;

public class QueryResult {
	
	 private int count;
	 private List<User> listuser;
	 
	 public QueryResult(){}
	 public QueryResult(int count ,List<User> listuser){
		 this.count=count;
		 this.listuser=listuser;
	 }
	 
	 
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<User> getListuser() {
		return listuser;
	}
	public void setListuser(List<User> listuser) {
		this.listuser = listuser;
	}

	 
	 
}
