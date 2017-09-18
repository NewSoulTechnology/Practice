package com.self.day_one;

public class BaseDataType {

	/**
	 * 基本数据练习
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //定义基本数据类型
		byte var_1 = 89;//占1个字节
		short var_2 = 90;//占2个字节
		int var_3 = 80;//占4个字节
		long var_4 = 93;//占8个字节
		float var_5 = 7.9f;//占4个字节
		double var_6 = 9.3;//占8个字节
		char var_7 = 'a';//0~65535
		String var_8 = "hello";
		//字符与数字
		System.out.println(var_7+var_1);//结果186
		//字符串与数字
		System.out.println(var_8+var_4);//结果hello93
		System.out.println(8+9+"a"+"a"+8+9);//结果17aa89
		System.out.println(8+9+"a"+"a"+(8+9));//结果17aa17
		//字符串与字符
		System.out.println(var_8+var_7);//结果helloa
	}

}
