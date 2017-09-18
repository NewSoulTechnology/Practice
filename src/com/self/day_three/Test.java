package com.self.day_three;

public class Test {
public static void main(String[] args) {
//	Father father=new Father(10);
//	System.out.println(father.getName()+":"+father.getAge());
//	Father father2=new Father();
//	System.out.println(father2.getName()+":"+father2.getAge());
	Father father=new Father(20);
	Son son=new Son();
	Son_2 son_2=new Son_2();
//	father.say();
//	father=new Son();
//	father.say();
//	father=new Son_2();
//	father.say();
	System.out.println("++++++++++++++++");
	Test.say(father);
	Test.say(son);
	Test.say(son_2);
	System.out.println("++++++++++++++++");
	//Son son=new Son();
	son.setGender(1);
	System.out.println(son.getName()+":"+son.getAge()+":"+son.getGender());
	Aclass aclass=new Cclass();
	aclass.say();
	System.out.println("--------------");
	Dclass dclass=new Dclass() {};
	dclass.say();
	Dclass dclass2=new Eclass() {};
	dclass2.say();
	Eclass eclass=new Eclass() {};
	eclass.see(dclass);
}
public static void say(Father father){
	father.say();
}
}
