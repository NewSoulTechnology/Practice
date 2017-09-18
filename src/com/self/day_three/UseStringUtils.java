package com.self.day_three;

public class UseStringUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		  String string="aa";
//          StringBuffer stringBuffer=new StringBuffer(string);
//          String string2=stringBuffer.append("s").toString();
//          System.out.println(string==string2);
//          StringBuffer stringBuffer2=stringBuffer.append("f");
//          System.out.println(stringBuffer==stringBuffer2);
		String string="aa";
        StringBuffer stringBuffer=new StringBuffer(string);
        stringBuffer.append("c");
        StringBuffer stringBuffer2=stringBuffer.append("f");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer2);
	}

}
