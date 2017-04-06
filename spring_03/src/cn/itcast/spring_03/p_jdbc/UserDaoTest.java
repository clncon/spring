package cn.itcast.spring_03.p_jdbc;



  
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试  
@ContextConfiguration("applicationContext.xml") 
public class UserDaoTest {
	   
	   @Resource
	 private UserDao userDao; 
	   
	   @Test
	  public void test(){
		   userDao.testGet(1);
	  }
	@Test
	public void testSaveUser() {
		User user = new User();
		user.setName("张三");
		user.setAge(25);
	   userDao.saveUser(user);
	}
	@Test
	public void testSaveUser_25(){
     	for(int i=1;i<=25;i++){
     		User user = new User();
    		user.setName("张三_"+i);
    		user.setAge(i);
    	   userDao.saveUser(user);    
        }
	}

	@Test
	public void testDeleteUser() {
		userDao.deleteUser(2);
	}

	@Test
	public void testUpdateUser() {
		User user = new User();
		user.setId(3);
		user.setName("李四");
		user.setAge(10);
		userDao.updateUser(user);
	}

	@Test
	public void testGetUserById() {
		User user = userDao.getUserById(3);
		System.out.println(user.toString());
	}

	@Test
	public void testFindAll() {
		List<User> listuser = userDao.findAll();	
		for(User user: listuser){
			System.out.println(user);
		}
	}

	@Test
	public void testGetCount() {
		int count = userDao.getCount();
		System.out.println(count);
	}
	@Test
	public void testFindAllIntInt() {
	   /// QueryResult qr = userDao.findAll(0, 10);
	   // QueryResult qr =userDao.findAll(10, 10);
	    QueryResult qr =userDao.findAll(20, 10);
		
	    System.out.println("总数量为:"+qr.getCount());
	    for(User user:qr.getListuser()){
	    	System.out.println(user);
	    }
	}

}
