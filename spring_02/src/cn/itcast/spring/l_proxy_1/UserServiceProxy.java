package cn.itcast.spring.l_proxy_1;

public class UserServiceProxy implements UserService{

	
	   private UserService userservice;
	   
	   public UserServiceProxy(UserService userservice){
		   this.userservice=userservice;
		   
	   }
	@Override
	public void queryUser() {
		System.out.println("--开始执行查询--");		
		  userservice.queryUser();
	    System.out.println("--查询操作已经完毕--");
	}

	@Override
	public void saveUser() {
		// TODO Auto-generated method stub
		System.out.println("--开始执行保存--");		
		userservice.saveUser();
		System.out.println("--保存操作已经完毕--");
		
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("--开始执行删除--");		
		userservice.deleteUser();
		System.out.println("--删除操作已经完毕--");
		
	}

}
