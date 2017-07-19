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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Material other = (Material) obj;
		if (name != other.name)
			return false;
		return true;
	}
	
	
}
