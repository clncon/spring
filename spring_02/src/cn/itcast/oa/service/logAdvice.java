package cn.itcast.oa.service;

import org.aspectj.lang.ProceedingJoinPoint;

public class logAdvice{
	
	
	
	  public void before(){
		  
		  System.out.println(">==��ҵ�񷽷�ִ��֮ǰִ��==<");
	  }
	  
	   
	 public void after(){
		 System.out.println(">==��ҵ�񷽷�ִ��֮�����ִ��==<");
	 }
	
	public void afterthrow(){
		
		System.out.println(">==���׳��쳣ʱִ�еķ���==<");
	}
	
	public void aferreturn(){
		System.out.println(">==ҵ�񷽷�ִ�к�ִ�еķ���==<");
	}
	
	
	public void around(ProceedingJoinPoint joinpoit){
		
		 
		  try {
			  System.out.println("==������ִ��ǰҪִ�еĴ���");
			joinpoit.proceed();
			System.out.println("==������ִ�к�Ҫִ�еĴ���");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
