package com.self.day_three;

public class OverLoad {
	   protected void say(int a){
		   System.out.println("function1");
	   }
       public void say(){
    	   System.out.println("function1");
       }
       private void say(double a){
    	   System.out.println("function1");
       }
       public int say(int a,int b){
    	   return 1;
       }
       public static void main(String[] args) {
		OverLoad overload=new OverLoad();
		overload.say();
		overload.say(5.00);
		overload.say(0, 0);
	}
}
