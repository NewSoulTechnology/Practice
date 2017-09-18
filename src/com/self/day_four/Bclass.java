package com.self.day_four;

public class Bclass extends Aclass{
	private int age;
	
	  public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void say(){
    	  System.out.println("Bclass:"+getName());
      }
}
