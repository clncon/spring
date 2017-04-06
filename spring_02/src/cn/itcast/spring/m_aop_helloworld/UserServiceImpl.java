package cn.itcast.spring.m_aop_helloworld;

public class UserServiceImpl implements UserService{

	@Override
	public void queryUser() {
		System.out.println(">==queryUser==<");
		
	}

	@Override
	public void saveUser() {
		System.out.println(">==saveUser==<");
	}

	@Override
	public void deleteUser() {
		System.out.println(">==deleteUser==<");
		
	}

}
