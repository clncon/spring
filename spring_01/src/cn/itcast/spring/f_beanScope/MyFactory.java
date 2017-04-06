package cn.itcast.spring.f_beanScope;

public class MyFactory {
	
	 //����ʽ
	/*private static MyFactory myfactory= new MyFactory();
	
	 public static MyFactory getMyFactoryInstance(){
		 return myfactory;
	 }*/

	
	 //����ʽ
	
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
