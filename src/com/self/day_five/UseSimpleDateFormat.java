package com.self.day_five;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UseSimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//按自定义格式  YYYY-MM-dd HH:mm:ss
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		Date date = new Date();
		String datetime = simpleDateFormat.format(date);
		System.out.println(datetime);
		
	}

}
