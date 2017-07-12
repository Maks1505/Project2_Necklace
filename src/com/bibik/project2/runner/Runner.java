package com.bibik.project2.runner;

import com.bibik.project2.entity.EnumGemstone;
import com.bibik.project2.entity.Necklace;
import com.bibik.project2.entity.PreciousGemstone;

public class Runner {

	public static void main(String[] args) {
		//Create Necklace
		Necklace n1 = new Necklace();
		n1.newDecorElement(new PreciousGemstone(EnumGemstone.RUBY, 5, 1.5, false, 3));
		n1.newDecorElement(new PreciousGemstone(EnumGemstone.DIAMOND, 4, 0.5, false, 5));
		
		n1.getDecorElements().forEach(x -> System.out.println(x.calculateCost()));
		System.out.println("GemMass " + n1.calculateGemMass());
		System.out.println("NecklaceCost " + n1.calculateNeckalceCost());
		
	}
}
