package com.self.day_six;

public class MyThread extends Thread{
    private int count=5;
    @Override
    public void run() {
    	// TODO Auto-generated method stub
    	for(int i=0;i<5;i++){
    		if(count>0){
    			System.out.println(Thread.currentThread().getName()+" "+count--);
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           MyThread myThread=new MyThread();
           new Thread(myThread,"张三").start();;
           new Thread(myThread,"李四").start();;
	}

}
