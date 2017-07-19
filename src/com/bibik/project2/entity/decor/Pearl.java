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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((pearlClass == null) ? 0 : pearlClass.hashCode());
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
		Pearl other = (Pearl) obj;
		if (pearlClass != other.pearlClass)
			return false;
		return true;
	}

	
}
