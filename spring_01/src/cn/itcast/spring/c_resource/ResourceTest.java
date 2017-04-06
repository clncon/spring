package cn.itcast.spring.c_resource;

import java.net.MalformedURLException;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.context.support.ServletContextResource;

public class ResourceTest {
	
	
	
     /**
      * ≤‚ ‘ClassPathResource
     * @throws Exception 
      */
	  @Test
	public void testClassPathResource() throws Exception{
		Resource resource = new ClassPathResource("cn/itcast/spring/c_resource/applicationContext_userdao.xml");
		Resource resource2 = new ClassPathResource("applicationContext_userdao.xml",this.getClass());
		
		//¥Ú”°
		System.out.println(resource.getFile().getAbsolutePath());
		System.out.println(resource2.getFile().getAbsolutePath());
		
	}
	  
	  
	//FileSystemResource
	//URLResource
	  
	   @Test
	   public void Test2() throws Exception{
		    //FileSystemResource
		    FileSystemResource resource = new FileSystemResource("E:/applicationContext_service.xml");
		    System.out.println(resource.exists());
		    System.out.println(resource.getFile().getAbsolutePath());
		    
		    //URLResource
//		    UrlResource urlresource = new UrlResource("file:E:/applicationContext_service.xml");
		    System.out.println(resource.exists());
		    System.out.println(resource.getFile().getAbsolutePath());
	   }
	   
	   
	   //ServletContextResource
	   
	   public void testServletContextResource(){
		   /*Resource resource = new ServletContextResource(servletContext, "/WEB-INF/jsp/applicationContext_service.xml");
		   System.out.println(resource.getFile().getAbsolutePath());*/
	   }

}
