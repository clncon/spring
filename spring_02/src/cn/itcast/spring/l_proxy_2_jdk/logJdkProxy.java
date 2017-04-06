package cn.itcast.spring.l_proxy_2_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class logJdkProxy implements InvocationHandler{

	
	   private Object target;//目标对象
	   //使用该构造方法来传送目标对象
	   public logJdkProxy(Object target){
		   this.target=target;
	   }
	   /**
	    * 创建一个代理对象
	    * @return
	    */
	   public Object createProxyInstance(){
		   return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	   }
	   
	   /**
	    *  代理对象会使用反射的机制对接口的每个方法调用此方法
	    * @param proxy:代理对象
	    * @param method:当前要执行的方法
	    * @param args:方法的参数
	    */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("==业务方法开始执行操作==");
		  //调用目标对象的处理方法
		     Object result = method.invoke(target, null);
		 System.out.println("==业务方法执行完毕==");
		return result;
	}

}
