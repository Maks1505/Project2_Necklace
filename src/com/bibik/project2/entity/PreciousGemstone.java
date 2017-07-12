package com.bibik.project2.entity;

public class PreciousGemstone extends Gemstone{
	private EnumGemstone name;
	private int clarity;
	private double mass;
	private boolean syntheticGem;
	private int count = 1;


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
		return name.getPrice()*count*mass*(!syntheticGem ? 1 : 0.3);
	}
	
	public double calculateTotalMass() {
		return mass*count;
	}

	public int getClarity() {
		return clarity;
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


	public EnumGemstone getName() {
		return name;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	
}
