package com.bibik.project2.entity;

public class Pearl extends Gemstone{
	private EnumPearlClass pearlClass;
	private int count = 1;
	private static final String NAME="Pearl";

	public Pearl(EnumPearlClass pearlClass, int count) {
		super();
		this.pearlClass = pearlClass;
		this.count = count;
	}

	public EnumPearlClass getPearlClass() {
		return pearlClass;
	}

	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static String getName() {
		return NAME;
	}

	@Override
	public double calculateCost() {
		return pearlClass.getPrice();
	}
	
}
