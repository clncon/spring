package cn.itcast.spring.l_proxy_3_cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class logCglibProxy implements MethodInterceptor{

	
	   //Ŀ�����
	   private Object target;
	   
	    //ͨ�����췽������Ŀ�����
	   public logCglibProxy(Object target){
		   this.target=target;
	   }
	   
	   /**
	    * ����һ����������������
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
		 System.out.println("==��ʼִ��ҵ�񷽷�==");
		  Object result = method.invoke(target,args);//����ҵ�񷽷�
		  System.out.println("==����ҵ�񷽷���ִ��==");
		return result;
	}

}
