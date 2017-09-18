package com.self.day_five;

public class TestMyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a=0,b=0;
           try {
			TestMyException.doSomething(a, b);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
           TestMyException.testSomething(a, b);
	}
	
	public static void doSomething(int x,int y) throws MyException{
 	   if(y==0)
 		   throw new MyException("除数为零！");
 	   if(x<0)
 		   throw new MyException("被除数为零！");
    }
	
	public static void testSomething(int x,int y){
		if(y==0)
	 		   throw new TestMyRuntimeException("除数为零！");
	 	   if(x<0)
	 		   throw new TestMyRuntimeException("被除数为零！");
	}

}
