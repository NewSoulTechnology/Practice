package com.self.day_five;

import java.util.Arrays;

public class User {
    private int age;
    private double weight;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
    public static void main(String[] args) {
		User[] users=new User[3];
		for (int i = 0; i < users.length; i++) {
			users[i]=new User();
		}
		users[0].setAge(10);users[0].setWeight(20.9);
		users[1].setAge(20);users[1].setWeight(17.9);
		users[2].setAge(9);users[2].setWeight(22.9);
		//Arrays.sort(users, new MultiObjectSortStrategy_1());
		Arrays.sort(users, new MultiObjectSortStrategy_2());
		for (User user : users) {
//			System.out.print(user.getAge()+"  ");
			System.out.print(user.getWeight()+"  ");
		}
		System.out.println();
	}
}
