package com.self.day_six;

public class MyRunable implements Runnable{
	private int count=5;
    @Override
    public  void run() {
    	// TODO Auto-generated method stub
    	for(int i=0;i<5;i++){
    		if(count>0){
    			System.out.println(Thread.currentThread().getName()+" "+count--);
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           MyRunable myRunable=new MyRunable();
           new Thread(myRunable,"张三").start();;
           new Thread(myRunable,"李四").start();;
	}

}
