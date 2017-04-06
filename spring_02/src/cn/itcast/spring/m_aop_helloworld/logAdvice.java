package cn.itcast.spring.m_aop_helloworld;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



public class logAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
	     System.out.println(">==开始进行业务方法==<");
	       Object result = methodInvocation.proceed();
	      System.out.println(">==结束业务方法的执行==<");
		return result;
	}

	
	
}
