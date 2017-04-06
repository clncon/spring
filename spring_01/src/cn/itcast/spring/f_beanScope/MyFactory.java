package cn.itcast.spring.f_beanScope;

public class MyFactory {
	
	 //¶öººÊ½
	/*private static MyFactory myfactory= new MyFactory();
	
	 public static MyFactory getMyFactoryInstance(){
		 return myfactory;
	 }*/

	
	 //ÀµººÊ½
	
    private static MyFactory myfactory=null;
    
    public static MyFactory getMyFactoryInstance(){
    	
    	if(myfactory==null){
    		synchronized (myfactory) {
				myfactory=  new MyFactory();
			};
    	}
    	return myfactory;
    }
    
    public MyFactory(){}
    
    
    public Object createObject(){
    	System.out.println("MyFactory.createObject");
    	return new Object();
    }
}
