package com.bibik.project2.entity;

public abstract class Decor {
	int clarity = 0;
	int count = 1;
	
	public abstract double calculateCost();
	public abstract String convertNameToString();

	public int getClarity() {
		return clarity;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	};

}
