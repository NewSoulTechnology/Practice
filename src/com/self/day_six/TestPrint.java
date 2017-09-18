package com.self.day_six;

public class TestPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Print print = new Print();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 52; i++) {
					print.OutputNumber();
				}
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 26; i++) {
					print.OutputCharacter();
				}
			}
		}).start();
	}

}
