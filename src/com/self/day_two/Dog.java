package com.self.day_two;

public class Dog {
    public int age;
    public void change(int age){
    	age++;
    	System.out.println("change"+age);
    }
    public void chang1(Dog dog){
    	dog.age++;//或者age++    
    	          //原因是在new 出这个对象时，这个对象被调用，这时age仍属于这个对象
    }
    public void chang2(Dog dog){
    	age++;//或者this.age++;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dog dog=new Dog();
       int age=10;
       dog.age=20;
       dog.change(age);
       System.out.println(age);
       dog.chang1(dog);
       System.out.println(dog.age);
       Dog dog2=new Dog();
       dog2.age=30;
       dog.chang1(dog2);
       System.out.println(dog.age);
       System.out.println(dog2.age);
       dog.chang2(dog2);
       System.out.println(dog.age);
       System.out.println(dog2.age);
	}

}
