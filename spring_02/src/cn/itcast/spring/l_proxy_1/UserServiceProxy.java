package cn.itcast.spring.l_proxy_1;

public class UserServiceProxy implements UserService{

	
	   private UserService userservice;
	   
	   public UserServiceProxy(UserService userservice){
		   this.userservice=userservice;
		   
	   }
	@Override
	public void queryUser() {
		System.out.println("--��ʼִ�в�ѯ--");		
		  userservice.queryUser();
	    System.out.println("--��ѯ�����Ѿ����--");
	}

	@Override
	public void saveUser() {
		// TODO Auto-generated method stub
		System.out.println("--��ʼִ�б���--");		
		userservice.saveUser();
		System.out.println("--��������Ѿ����--");
		
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("--��ʼִ��ɾ��--");		
		userservice.deleteUser();
		System.out.println("--ɾ�������Ѿ����--");
		
	}

}
