package com.bibik.project2.entity;

public enum EnumMaterial {
	LEATHER(10), WOOD(5);
	private int price;
	
	EnumMaterial (int price){
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	
}
