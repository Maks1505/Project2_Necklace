package com.bibik.project2.entity;

public class Material extends Decor {
	private EnumMaterial name;
	private int count = 1;
	
	public Material(EnumMaterial name) {
		super();
		this.name = name;
	}
	

	@Override
	public double calculateCost() {
		return name.getPrice()*count;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public EnumMaterial getName() {
		return name;
	}

}
