package com.bibik.project2.entity;

import java.util.ArrayList;

public class Necklace {
	private ArrayList<Decor> decorElements = new ArrayList<Decor>();

	public void newDecorElement(Decor element) {
		decorElements.add(element);
	}
	
	public ArrayList<Decor> getDecorElements() {
		return decorElements;
	}
	
	public double calculateGemMass() {
		double mass = 0;
		for (Decor d : decorElements) {
			if (d instanceof PreciousGemstone) {
				mass += ((PreciousGemstone) d).calculateTotalMass();
			}
		}
		return mass;
	}
	
	public double calculateNeckalceCost() {
		double cost = 0;
		for (Decor d : decorElements) {
			cost += d.calculateCost();
		}
		return cost;
	}
	
}
