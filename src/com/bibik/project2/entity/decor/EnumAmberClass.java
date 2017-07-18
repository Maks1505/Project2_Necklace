package com.bibik.project2.entity.decor;

public enum EnumAmberClass {
	AMBER_CLASS_I(5), AMBER_CLASS_II(7), AMBER_CLASS_III(10), AMBER_CLASS_IV(15), AMBER_CLASS_V(20);
	private int price;
	
	private EnumAmberClass(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
}

