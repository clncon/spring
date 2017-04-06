package cn.itcast.spring.j_beanproperty_annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component()
public class UserService {
	
	
	private UserDao userdao;

	public UserDao getUserdao() {
		return userdao;
	}
     @Resource
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}
	
	

}
