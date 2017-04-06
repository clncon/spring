package cn.itcast.spring.l_proxy_3_cglib;

public class UserService {

	
	
	public static void fool4(){
		System.out.println(">==static==<");
	}
	public final void fool5(){
		
		System.out.println(">==final==<");
	}
	protected void fool1(){
		System.out.println(">==protected==<");
	}
	
	
	 /**
	  * default的子类是不可以访问的
	  */
	void fool2(){
		 fool3();
		System.out.println(">==default==<");
	}
	private void fool3(){
		System.out.println(">==private==<");
	}
	public void queryUser() {
		System.out.println("queryUser");
		
	}

	
	public void saveUser() {
		System.out.println("saveUser");
	}

	
	public void deleteUser() {
		System.out.println("deleteUser");
	}
}
