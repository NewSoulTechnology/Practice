package com.self.day_five;

import java.util.Arrays;

public class SingleObjectSort implements Comparable {

	private int age;

	public SingleObjectSort() {
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		SingleObjectSort singleObjectSort=(SingleObjectSort)o;
		if(getAge()>singleObjectSort.getAge())
		    return 1;
		else if(getAge()==singleObjectSort.getAge())
			return 0;
		else 
			return -1;
	}
public static void main(String[] args) {
	SingleObjectSort[] singleObjectSorts=new SingleObjectSort[3];
    for(int i=0;i<singleObjectSorts.length;i++){
    	singleObjectSorts[i]=new SingleObjectSort();
    }
	singleObjectSorts[0].setAge(10);
	singleObjectSorts[1].setAge(20);
	singleObjectSorts[2].setAge(9);
	Arrays.sort(singleObjectSorts);
	for (SingleObjectSort singleObjectSort : singleObjectSorts) {
		System.out.print(singleObjectSort.getAge()+" ");
	}
	System.out.println();
}
}
