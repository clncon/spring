package cn.itcast.spring_03.q_tx;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)  //ʹ��junit4���в���  
@ContextConfiguration("applicationContext.xml") 
public class mainText {
	
	
	  @Resource
	 private UserService userService;
	  
	  @Test
	  public void test(){
		  
		  userService.saveTwoUser();
	  }
	  

}
