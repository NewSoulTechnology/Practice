package com.self.day_four;

public class Use2 {
 public static void main(String[] args) {
	Tclass tclass=new Tclass();
	tclass.age=10;
	tclass.say();
	Yclass yclass=new Yclass(tclass);
	yclass.look();
}
}
