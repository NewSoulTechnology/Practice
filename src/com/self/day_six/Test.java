package com.self.day_six;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Space space=new Space();
        Produce produce=new Produce(space);
        Comsum comsum=new Comsum(space);
        new Thread(produce).start();
        new Thread(comsum).start();
	}

}
