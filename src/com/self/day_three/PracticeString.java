package com.self.day_three;

public class PracticeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String string="abc";
          String string2="abc";
          String string3=new String("abc");
          String string4=new String("abc");
          String string5=string+1;
          //用双引号声明的String变量，是放到一块公共的字符串池当中
          System.out.println(string==string2);
          //用new关键字声明的String变量，是单独放到一个内存当中
          System.out.println(string==string3);
          System.out.println(string==string3.intern());
          System.out.println(string3==string4);
          System.out.println(string3.intern()==string4.intern());
          //String变量一旦声明，就不能再更改
          System.out.println(string==string5);
          //字符串拼接为什么很少用"+",(1)'+'用来拼接效率太低；因为每次使用'+'拼接都相当
          //于重新生成一个新的Strig变量浪费空间和时间
	}

}
