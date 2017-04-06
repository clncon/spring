package cn.itcast.spring.o_aop_annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class logAdvice{
	   /**
	    * 
	    * 声明一个切入点，本方法不可以有返回值和参数
	    */
	   @Pointcut("execution(public * *(..))")
	   private void mypointcut(){}
	
	   
	  /*
	   * 前置通知，在原方法之前执行
	   * */
	  @Before(value = "mypointcut()")
	  public void before(){
		  
		  System.out.println(">==在业务方法执行之前执行==<");
	  }
	  
	   /**
	    * 
	    * 最终通知,原方法执行完成后必须要执行的方法
	    *即使发生了异常也要执行
	    */
	  @After("mypointcut()")
	 public void after(){
		 System.out.println(">==在业务方法执行之后必须执行==<");
	 }
	
	  
	   /**
	    * 异常通知，当原方法发生异常时才会执行的方法
	    */
	   @AfterThrowing("mypointcut()")
	public void afterthrow(){
		
		System.out.println(">==当抛出异常时执行的方法==<");
	}
	
	   /**
	    * 后置通知，当原方法执行后才会执行
	    * 如果原方法发生了异常则不会执行
	    * 方法一：@AfterReturning("myPointcut()")
	    * 方法二：@AfterReturning(pointcut = "myPointcut()")
	    * 可以使用returning 指定对应的参数名，Spring就会在调用本方法时把返回值传给指定的名称的参数
	    */
	   @AfterReturning(value="mypointcut()",returning="returnvalue")
	public void aferreturn(Object returnvalue){
		   System.out.println(returnvalue);
		System.out.println(">==业务方法执行后执行的方法==<");
	}
	
	    /**
	     * 环绕通知，在原方法执行前后执行
	     * @param joinpoit
	     * @throws Throwable 
	     * 原方法在执行时抛出异常后，环绕通知方法后面的代码不会执行
	     * 一定要在原方法执行完成后将返回值在本方法中返回
	     */
	@Around(value="mypointcut()")
	public Object around(ProceedingJoinPoint joinpoit) throws Throwable{
		
		 
		 
			  System.out.println("==当方法执行前要执行的代码");
			Object result = joinpoit.proceed();
			System.out.println("==当方法执行后要执行的代码");
			
			return result;
		
	}
	
}
