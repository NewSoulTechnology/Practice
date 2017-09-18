package com.self.day_five;

import java.util.Calendar;

public class UseCanledar {
	public static void main(String[] args) {
         Calendar calendar=Calendar.getInstance();
         //getTime()获取当前时间
         System.out.println(calendar.getTime());
         //返回当前Calendar的时间值，以毫秒为单位
         System.out.println(calendar.getTimeInMillis());
         //在GET方法里添加下列字段获取对应信息
         //YEAR          年
         //MONTH         月
         //DATE          日
         //DAY_OF_WEEK  星期(以星期天开始。从0到6)
         //HOUR_OF_DAY   时
         //MINUTE        分
         //SECOND        秒
         //.......
         System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
         
	}
}
