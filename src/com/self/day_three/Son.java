package com.self.day_three;

public class Son extends Father{
      private int gender;
      private int age=19;
      public Son() {
		// TODO Auto-generated constructor stub
    	  super(20);
	}
	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	public void say(){
	   	 System.out.println("son:"+age);
	    }
}
