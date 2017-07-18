package com.bibik.project2.entity;

public abstract class Decor {
	int clarity = 0;
	int count = 1;
	
	public abstract double calculateCost();
	public abstract String convertNameToString();

	public int getClarity() {
		return clarity;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clarity;
		result = prime * result + count;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Decor other = (Decor) obj;
		if (clarity != other.clarity)
			return false;
		if (count != other.count)
			return false;
		return true;
	};

	
	
}
