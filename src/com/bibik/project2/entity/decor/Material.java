package com.bibik.project2.entity.decor;

public class Material extends Decor {
	private EnumMaterial name;
	
	public Material(EnumMaterial name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	

	@Override
	public double calculateCost() {
		return name.getPrice()*count;
	}
	
	@Override
	public String convertNameToString() {
		return name.toString();
	}

	@Override
	public String toString() {
		return "Material [name=" + name + ", count=" + count + "]";
	}
	
}
