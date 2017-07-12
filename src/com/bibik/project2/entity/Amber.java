package com.bibik.project2.entity;

public class Amber extends Gemstone{
	private EnumAmberClass amberClass;
	private int age;
	private int count = 1;
	private static final String NAME="Amber";

	public Amber(EnumAmberClass amberClass, int age, int count) {
		super();
		this.amberClass = amberClass;
		this.age = age;
		this.count = count;
	}

	public int getAge() {
		return age;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	public EnumAmberClass getAmberClass() {
		return amberClass;
	}

	@Override
	public double calculateCost() {
		return amberClass.getPrice()*count;
	}

	public static String getName() {
		return NAME;
	}
	
}
