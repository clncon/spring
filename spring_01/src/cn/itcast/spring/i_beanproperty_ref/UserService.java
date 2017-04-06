package cn.itcast.spring.i_beanproperty_ref;

public class UserService {
	
	
	private UserDao userdao;

	public UserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	
	

}
