package com.bibik.project2.entity.decor;

public enum EnumPearlClass {
	PERL_CLASS_A(4), PERL_CLASS_AA(6), PERL_CLASS_AAA(10);
	private int price;
	
	private EnumPearlClass(int price) {
		this.price=price;
	}

	public int getPrice() {
		return price;
	}
	
}
