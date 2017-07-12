package com.bibik.project2.entity;

public enum EnumAmberClass {
	CLASSI(5), CLASSII(7), CLASSIII(10), CLASSIV(15), CLASSV(20);
	private int price;
	
	private EnumAmberClass(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
}

