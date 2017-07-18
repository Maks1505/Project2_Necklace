package com.bibik.project2.entity.decor;

public class Pearl extends Decor{
	private EnumPearlClass pearlClass;

	public Pearl(EnumPearlClass pearlClass, int count) {
		super();
		this.pearlClass = pearlClass;
		this.count = count;
	}

	public EnumPearlClass getPearlClass() {
		return pearlClass;
	}

	
	@Override
	public String convertNameToString() {
		return pearlClass.name();
	}

	@Override
	public double calculateCost() {
		return pearlClass.getPrice();
	}

	@Override
	public String toString() {
		return "Pearl [pearlClass=" + pearlClass + ", count=" + count + "]";
	}

	
}
