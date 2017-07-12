package com.bibik.project2.entity;

public enum EnumPearlClass {
	CLASS_A(4), CLASS_AA(6), CLASS_AAA(10);
	private int price;
	
	private EnumPearlClass(int price) {
		this.price=price;
	}

	public int getPrice() {
		return price;
	}
	
}
