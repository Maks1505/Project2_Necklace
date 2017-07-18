package com.bibik.project2.entity.necklace;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibik.project2.entity.decor.Decor;

public class Necklace {
	private final static Logger LOGGER = LogManager.getLogger();
	private ArrayList<Decor> decorElements = new ArrayList<Decor>();

	public void newDecorElement(Decor element) {
		decorElements.add(element);
		LOGGER.info("New decor element added: " + element.toString());
		
	}
	
	public ArrayList<Decor> getDecorElements() {
		return decorElements;
	}
	
//	public double calculateGemMass() {
//		double mass = 0;
//		for (Decor d : decorElements) {
//			if (d instanceof PreciousGemstone) {
//				mass += ((PreciousGemstone) d).calculateTotalMass();
//			}
//		}
//		return mass;
//	}
	
//	public double calculateNeckalceCost() {
//		double cost = 0;
//		for (Decor d : decorElements) {
//			cost += d.calculateCost();
//		}
//		return cost;
//	}
	
}
