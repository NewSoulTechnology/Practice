package com.self.day_six;

public class AbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          final TestABC testABC=new TestABC();
          new Thread(new Runnable() {
			
        	  @Override
        		public void run() {
        			// TODO Auto-generated method stub
        			for (int i = 0; i < 5; i++) {
        				try {
        					testABC.OutputA();
        					Thread.sleep(100);
        				} catch (InterruptedException e) {
        					// TODO Auto-generated catch block
        					e.printStackTrace();
        				}
        			}
        		}
		}).start();
          new Thread(new Runnable() {
  			
        	  @Override
        		public void run() {
        			// TODO Auto-generated method stub
        			for (int i = 0; i < 5; i++) {
        				try {
        					testABC.OutputB();
        					Thread.sleep(100);
        				} catch (InterruptedException e) {
        					// TODO Auto-generated catch block
        					e.printStackTrace();
        				}
        			}
        		}
		}).start();
          new Thread(new Runnable() {
  			
        	  @Override
        		public void run() {
        			// TODO Auto-generated method stub
        			for (int i = 0; i < 5; i++) {
        				try {
        					testABC.OutputC();
        					Thread.sleep(100);
        				} catch (InterruptedException e) {
        					// TODO Auto-generated catch block
        					e.printStackTrace();
        				}
        			}
        		}
		}).start();
	}

}
