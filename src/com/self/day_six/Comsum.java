package com.self.day_six;

public class Comsum implements Runnable{
	private Space space;

	public Comsum(Space space) {
		this.space = space;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				space.pop();
				if(space.getIndex()==0){
					System.out.println("仓库没有存量");
				}else{
				System.out.printf("消费了1个产品,当前产品数量为%d%n",(space.getIndex()+1));
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
