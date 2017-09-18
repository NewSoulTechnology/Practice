package com.self.day_three;

public class Son_2 extends Father{
	private int gender;
	private int age=18;

    public Son_2() {
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
   	 System.out.println("son_2:"+age);
    }
}
