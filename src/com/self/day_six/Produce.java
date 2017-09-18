package com.self.day_six;

public class Produce implements Runnable {
	private Space space;

	public Produce(Space space) {
		this.space = space;
	}

	@Override
	public void run() {
		while (true) {
			Product product=new Product("A",10);
			try {
				space.push(product);
				System.out.printf("生产了1个产品,当前产品数量为%d%n",(space.getIndex()+1));
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
