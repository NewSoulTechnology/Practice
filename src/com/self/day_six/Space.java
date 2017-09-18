package com.self.day_six;

public class Space {
  
	private int index;
	private Product[] products=new Product[10];//最多存放10个
	
	
	public int getIndex() {
		return index;
	}

	public void push(Product product){
		synchronized(this){
			while(index==products.length){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.notify();
			products[index]=product;
			this.index++;
		}
	}
	
	public  Product pop(){  
        synchronized (this) {
		while(index==0){//筐空了，即栈空  
            try {  
                this.wait();  
            } catch (InterruptedException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
        }  
        this.notify();  
        this.index--;//push第n个之后，this.index++，使栈顶为n+1，故return之前要减一  
        return products[index];  
		}
    }  
}
