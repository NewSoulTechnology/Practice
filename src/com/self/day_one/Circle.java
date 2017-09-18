package com.self.day_one;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * break:结束包含break语句的循环
		 * continue:跳过当前循环
		 */
          for (int i = 0; i < 5; i++) {
			if(i==3)
				continue;
			for(int j=0;j<4;j++){
				System.out.println("j="+j);
				break;
			}
			System.out.println("i="+i);
		}
          System.out.println("====================");
          p:for(int i=0;i<5;i++){
        	  for(int j=0;j<5;j++){
        		  if(j==2) continue p;
        		  System.out.println(j);
        	  }
          }
	}

}
