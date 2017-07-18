package com.bibik.project2.entity;

public class PreciousGemstone extends Gemstone{
	private EnumGemstone name;
	private double mass;
	private boolean syntheticGem;
	private static final double SYNTH_PRICE_COEFFICIENT = 0.3;


	public PreciousGemstone(EnumGemstone gem, int clarity, double mass, boolean syntheticGem, int count) {
		super();
		this.name = gem;
		this.clarity = clarity;
		this.mass = mass;
		this.syntheticGem = syntheticGem;
		this.count = count;
	}


	@Override
	public double calculateCost() {
		return name.getPrice()*count*mass*(!syntheticGem ? 1 : SYNTH_PRICE_COEFFICIENT);
	}
	
	public double calculateTotalMass() {
		return mass*count;
	}


	public void setClarity(int clarity) {
		this.clarity = clarity;
	}


	public double getMass() {
		return mass;
	}


	public void setMass(double mass) {
		this.mass = mass;
	}


	public boolean isSyntheticGem() {
		return syntheticGem;
	}


	public void setSyntheticGem(boolean syntheticGem) {
		this.syntheticGem = syntheticGem;
	}


	@Override
	public String convertNameToString() {
		return name.toString();
	}


	@Override
	public String toString() {
		return "PreciousGemstone [name=" + name + ", clarity=" + clarity + ", mass=" + mass + ", syntheticGem="
				+ syntheticGem + ", count=" + count + "]";
	}

}
