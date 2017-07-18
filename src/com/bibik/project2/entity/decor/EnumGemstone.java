package com.bibik.project2.entity.decor;

public enum EnumGemstone {
	RUBY(17), DIAMOND(20), EMERALD(15), SAPPHIRE(13), TOPAZ(13);
	private int price;
	
	private EnumGemstone(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

}
