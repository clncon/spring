package cn.itcast.spring.m_aop_helloworld;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



public class logAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
	     System.out.println(">==��ʼ����ҵ�񷽷�==<");
	       Object result = methodInvocation.proceed();
	      System.out.println(">==����ҵ�񷽷���ִ��==<");
		return result;
	}

	
	
}
