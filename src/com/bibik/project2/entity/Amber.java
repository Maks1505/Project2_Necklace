package com.bibik.project2.entity;

public class Amber extends Gemstone{
	private EnumAmberClass amberClass;
	private int age;

	public Amber(EnumAmberClass amberClass, int age, int count) {
		super();
		this.amberClass = amberClass;
		this.age = age;
		this.count = count;
	}

	public int getAge() {
		return age;
	}

	public EnumAmberClass getAmberClass() {
		return amberClass;
	}

	@Override
	public double calculateCost() {
		return amberClass.getPrice()*count;
	}

	@Override
	public String convertNameToString() {
		return amberClass.name();
	}

	@Override
	public String toString() {
		return "Amber [amberClass=" + amberClass + ", age=" + age + ", count=" + count + "]";
	}
	
}
