package com.self.day_two;

public class Febinco {
    //斐波那契数列-----------递归解法
	public int febnico(int arg){
		if(arg==2)
			return 1;
		if(arg==1)
			return 1;
		return febnico(arg-1)+febnico(arg-2);
	}
    //斐波那契数列-----------非递归解法
	public int nonFebnico(int arg){
		int one_before=1,two_before=1;
		if(arg==1)
			return 1;
		if(arg==2)
			return 1;
		for(int i=3;i<=arg;i++){			
			int temp=one_before;
			one_before=two_before+one_before;
			two_before=temp;
		}
		return one_before;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Febinco febinco=new Febinco();
         System.out.println(febinco.febnico(25));
         System.out.println(febinco.nonFebnico(25));
	}

}
