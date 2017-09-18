package com.self.day_six;

public class TestABC{
    private int flag=1;
	public void OutputA(){
		synchronized (this) {
			while(flag!=1){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.notifyAll();
			System.out.println("A");
			flag=2;
		}
	}
	public void OutputB(){
		synchronized (this) {
			while(flag!=2){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.notifyAll();
			System.out.println("B");
			flag=3;
		}
	}
	public void OutputC(){
		synchronized (this) {
			while(flag!=3){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.notifyAll();
			System.out.println("C");
			flag=1;
		}
	}
}
