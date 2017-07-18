package com.bibik.project2.action;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.bibik.project2.entity.Decor;
import com.bibik.project2.entity.Necklace;
import com.bibik.project2.entity.PreciousGemstone;

public class NecklaceAction {
	public static void sortDecorByCost(Necklace neck){
		Comparator<Decor> comp = ((o1, o2) -> Double.compare(o1.calculateCost(), o2.calculateCost()));
		neck.getDecorElements().sort(comp);
	}
	
	public static void sortDecorByNameAndCost(Necklace neck){
		Comparator<Decor> comp1 = ((o1, o2) -> (o1.convertNameToString().compareTo(o2.convertNameToString()) == 0 ? (Double.compare(o1.calculateCost(), o2.calculateCost())) : (o1.convertNameToString().compareTo(o2.convertNameToString()))));
		neck.getDecorElements().sort(comp1);
	}
	
	public static List<Decor> filterDecorByClarity(Necklace neck, int lowBoundary, int highBoundary){
		Predicate<Decor> pred = o1 -> (o1.getClarity() >= lowBoundary && o1.getClarity() <= highBoundary) ? true : false;
		return neck.getDecorElements().stream().filter(pred).collect(Collectors.toList());
	}
	
	public static double calculateNeckalceCost(Necklace neck) {
		double cost = 0;
		for (Decor d : neck.getDecorElements()) {
			cost += d.calculateCost();
		}
		return cost;
	}
	
	public static double calculateGemMass(Necklace neck) {
		double mass = 0;
		for (Decor d : neck.getDecorElements()) {
			if (d instanceof PreciousGemstone) {
				mass += ((PreciousGemstone) d).calculateTotalMass();
			}
		}
		return mass;
	}
}
