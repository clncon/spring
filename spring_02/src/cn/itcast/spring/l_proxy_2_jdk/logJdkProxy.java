package cn.itcast.spring.l_proxy_2_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class logJdkProxy implements InvocationHandler{

	
	   private Object target;//Ŀ�����
	   //ʹ�øù��췽��������Ŀ�����
	   public logJdkProxy(Object target){
		   this.target=target;
	   }
	   /**
	    * ����һ���������
	    * @return
	    */
	   public Object createProxyInstance(){
		   return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	   }
	   
	   /**
	    *  ��������ʹ�÷���Ļ��ƶԽӿڵ�ÿ���������ô˷���
	    * @param proxy:�������
	    * @param method:��ǰҪִ�еķ���
	    * @param args:�����Ĳ���
	    */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("==ҵ�񷽷���ʼִ�в���==");
		  //����Ŀ�����Ĵ�����
		     Object result = method.invoke(target, null);
		 System.out.println("==ҵ�񷽷�ִ�����==");
		return result;
	}

}
