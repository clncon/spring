package cn.itcast.strust2_spring.action;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.strust2_spring.service.UserService;


@Component("testAction")
@Scope("prototype")
public class TestAction extends ActionSupport {

	  @Resource
	  private UserService userService;
	  
	  
	@Override
	public String execute() throws Exception {
		
		System.out.println("======>TestAction.excute()");
		//1.��һ�ַ�ʽ
		/*ApplicationContext ac = //
				(ApplicationContext)//
                   ServletActionContext.//
                   getServletContext().//
                   getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);*/
		
		 //�ڶ��ַ�ʽ
		  /* ApplicationContext ac = WebApplicationContextUtils//
				            .getWebApplicationContext
				             (ServletActionContext.getServletContext());
		  
		  userService = (UserService) ac.getBean("userService");*/
		  userService.saveUser();
		return SUCCESS;
	}

	
	
	  

}
