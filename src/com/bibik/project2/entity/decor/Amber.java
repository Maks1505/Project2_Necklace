package com.bibik.project2.entity.decor;

public class Amber extends Decor{
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + age;
		result = prime * result + ((amberClass == null) ? 0 : amberClass.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Amber other = (Amber) obj;
		if (age != other.age)
			return false;
		if (amberClass != other.amberClass)
			return false;
		return true;
	}
	
	
}
