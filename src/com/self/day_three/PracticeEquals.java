package com.self.day_three;

public class PracticeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Dog dog=new Dog("xiao",10);
           Dog dog2=new Dog("xiao", 10);
           System.out.println(dog==dog2);
           System.out.println(dog.equals(dog2));
           Person person=new Person("hong", 20, dog);
           Person person2=new Person("hong", 20, dog);
           Person person3=new Person("hong", 20, dog2);
           Person person4=new Person("hang", 20, dog);
           System.out.println("=============");
           System.out.println(person==person2);
           System.out.println(person==person3);
           System.out.println(person==person4);
           System.out.println(person2==person3);
           System.out.println(person2==person4);
           System.out.println(person3==person4);
           System.out.println("=============");
           System.out.println(person.equals(person2));
           System.out.println(person.equals(person3));
           System.out.println(person.equals(person4));
           System.out.println(person2.equals(person3));
           System.out.println(person2.equals(person4));
           System.out.println(person3.equals(person4));
	}

}
