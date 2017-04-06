package cn.itcast.oa.service;

import org.aspectj.lang.ProceedingJoinPoint;

public class logAdvice{
	
	
	
	  public void before(){
		  
		  System.out.println(">==在业务方法执行之前执行==<");
	  }
	  
	   
	 public void after(){
		 System.out.println(">==在业务方法执行之后必须执行==<");
	 }
	
	public void afterthrow(){
		
		System.out.println(">==当抛出异常时执行的方法==<");
	}
	
	public void aferreturn(){
		System.out.println(">==业务方法执行后执行的方法==<");
	}
	
	
	public void around(ProceedingJoinPoint joinpoit){
		
		 
		  try {
			  System.out.println("==当方法执行前要执行的代码");
			joinpoit.proceed();
			System.out.println("==当方法执行后要执行的代码");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
