package com.self.day_six;

public class Product {
	private String name="小馒头";
	private int number;

	public Product() {

	}

	public Product(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
