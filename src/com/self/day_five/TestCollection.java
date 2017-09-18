package com.self.day_five;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Set set=new HashSet();
         set.add("2");
         set.add(4);
         set.add('a');
         Set set2=new HashSet();
         set2.add("haha");
         set2.addAll(set);
         Iterator iterator=set2.iterator();
         while(iterator.hasNext()){
        	 System.out.println(iterator.next());
         }
         System.out.println(set2.contains(4));
         System.out.println(set2.size());
	}

}
