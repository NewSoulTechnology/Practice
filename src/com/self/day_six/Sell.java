package com.self.day_six;

public class Sell implements Runnable{
	ByTickts seller = new ByTickts();
	Thread buyer1 = new Thread(this);
	Thread buyer2 = new Thread(this);
	Thread buyer3 = new Thread(this);
	
	
	public Sell() {
		buyer1.start();
		buyer2.start();
		buyer3.start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (Thread.currentThread() == buyer1) {
			seller.byTickts(20);
		} else if (Thread.currentThread() == buyer2) {
			seller.byTickts(10);
		} else if (Thread.currentThread() == buyer3) {
			seller.byTickts(5);
		}
	}
	

}
