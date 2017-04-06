package cn.itcast.spring.l_proxy_3_cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class logCglibProxy implements MethodInterceptor{

	
	   //目标对象
	   private Object target;
	   
	    //通过构造方法传入目标对象
	   public logCglibProxy(Object target){
		   this.target=target;
	   }
	   
	   /**
	    * 创建一个代理对象的生成器
	    * @return
	    */
	   public <T>T createProxyInstance(){
		   Enhancer enhancer = new Enhancer();
		   enhancer.setSuperclass(target.getClass());
		   enhancer.setCallback(this);
		   T t =(T) enhancer.create();
		   return t;
	   }
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		 System.out.println("==开始执行业务方法==");
		  Object result = method.invoke(target,args);//调用业务方法
		  System.out.println("==结束业务方法的执行==");
		return result;
	}

}
