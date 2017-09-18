package com.self.day_five;

import java.util.Date;

public class UseDate {
 public static void main(String[] args) {
	Date date=new Date();
	//toString     
	System.out.println(date.toString());//Mon Aug 07 17:37:52 CST 2017
	//getTime,返回当前时间到1970年1月1日这个时间段的秒数
	System.out.println(date.getTime());//
	System.out.println();
}
}
