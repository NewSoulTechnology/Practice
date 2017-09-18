package com.self.day_two;

public class Person {
      private String name;//姓名
      private int gender;//性别，0代表男，1代表女
      private int age;//年龄
	public Person() {
	
	}
	public Person(String name, int gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Person(String name) {
		this.name = name;
		this.gender = 0;
		this.age = 20;
	}
	/**
	 * 获取姓名
	 * @return
	 *        姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置姓名
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取性别
	 * @return
	 *        性别
	 */
	public int getGender() {
		return gender;
	}
	/**
	 * 设置性别
	 * @param gender
	 */
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
