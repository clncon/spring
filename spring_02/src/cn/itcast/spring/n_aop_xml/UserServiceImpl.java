package cn.itcast.spring.n_aop_xml;

public class UserServiceImpl implements UserService{

	
	 public UserServiceImpl() {
	 }

	public void queryUser() {
		System.out.println(">==queryUser==<");
		
	}

	
	public void saveUser() {
		System.out.println(">==saveUser==<");
	}

	public void deleteUser() {
		System.out.println(">==deleteUser==<");
		
		
	}

}
