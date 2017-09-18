package com.self.day_three;

public class Father {
         private String name;
         private int age;
//         public Father() {
//			// TODO Auto-generated constructor stub
////        	 this(20);
//        	 System.out.println("Father");
//		}
         public Father(int age){
        	 name="张三";
        	 this.age=age;
         }
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
         public void say(){
        	 System.out.println(age);
         }
}
