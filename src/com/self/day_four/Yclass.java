package com.self.day_four;

public class Yclass{
       public int id;
       public Tclass tclass;
       public Yclass(Tclass tclass) {
		// TODO Auto-generated constructor stub
    	   this.tclass=tclass;
	}
       public void look(){
    	   System.out.println(tclass.age);
       }
       
}
