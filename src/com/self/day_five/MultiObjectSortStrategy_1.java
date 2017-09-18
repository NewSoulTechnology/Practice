package com.self.day_five;

import java.util.Comparator;

public class MultiObjectSortStrategy_1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		User user = (User) o1;
		User user2 = (User) o2;
		if (user.getAge() > user2.getAge())
			return 1;
		else if (user.getAge() == user2.getAge())
			return 0;
		else
			return -1;
	}

}
