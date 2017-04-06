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
	    * ����һ������㣬�������������з���ֵ�Ͳ���
	    */
	   @Pointcut("execution(public * *(..))")
	   private void mypointcut(){}
	
	   
	  /*
	   * ǰ��֪ͨ����ԭ����֮ǰִ��
	   * */
	  @Before(value = "mypointcut()")
	  public void before(){
		  
		  System.out.println(">==��ҵ�񷽷�ִ��֮ǰִ��==<");
	  }
	  
	   /**
	    * 
	    * ����֪ͨ,ԭ����ִ����ɺ����Ҫִ�еķ���
	    *��ʹ�������쳣ҲҪִ��
	    */
	  @After("mypointcut()")
	 public void after(){
		 System.out.println(">==��ҵ�񷽷�ִ��֮�����ִ��==<");
	 }
	
	  
	   /**
	    * �쳣֪ͨ����ԭ���������쳣ʱ�Ż�ִ�еķ���
	    */
	   @AfterThrowing("mypointcut()")
	public void afterthrow(){
		
		System.out.println(">==���׳��쳣ʱִ�еķ���==<");
	}
	
	   /**
	    * ����֪ͨ����ԭ����ִ�к�Ż�ִ��
	    * ���ԭ�����������쳣�򲻻�ִ��
	    * ����һ��@AfterReturning("myPointcut()")
	    * ��������@AfterReturning(pointcut = "myPointcut()")
	    * ����ʹ��returning ָ����Ӧ�Ĳ�������Spring�ͻ��ڵ��ñ�����ʱ�ѷ���ֵ����ָ�������ƵĲ���
	    */
	   @AfterReturning(value="mypointcut()",returning="returnvalue")
	public void aferreturn(Object returnvalue){
		   System.out.println(returnvalue);
		System.out.println(">==ҵ�񷽷�ִ�к�ִ�еķ���==<");
	}
	
	    /**
	     * ����֪ͨ����ԭ����ִ��ǰ��ִ��
	     * @param joinpoit
	     * @throws Throwable 
	     * ԭ������ִ��ʱ�׳��쳣�󣬻���֪ͨ��������Ĵ��벻��ִ��
	     * һ��Ҫ��ԭ����ִ����ɺ󽫷���ֵ�ڱ������з���
	     */
	@Around(value="mypointcut()")
	public Object around(ProceedingJoinPoint joinpoit) throws Throwable{
		
		 
		 
			  System.out.println("==������ִ��ǰҪִ�еĴ���");
			Object result = joinpoit.proceed();
			System.out.println("==������ִ�к�Ҫִ�еĴ���");
			
			return result;
		
	}
	
}
