package com.self.day_six;

public class Print {
	private int flag = 1;
	private int var = 1;
	private int temp = 65;

	public void OutputNumber() {
		synchronized (this) {
			while (flag % 3 == 0) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.notify();
			System.out.println(var++);
			flag++;
		}
	}

	public void OutputCharacter() {
		synchronized (this) {
			while (flag % 3 != 0) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.notify();
			System.out.println((char) (temp++));
			flag++;
		}
	}
}
