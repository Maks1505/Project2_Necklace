package com.bibik.project2.runner;

import java.io.File;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibik.project2.action.NecklaceAction;
import com.bibik.project2.entity.Decor;
import com.bibik.project2.entity.Necklace;
import com.bibik.project2.entity.NecklaceBuilder;
import com.bibik.project2.exception.FileReadException;
import com.bibik.project2.readfile.ReadFile;

public class Runner {
	private static final int CLARITY_LOW_BOUNDERY = 1;
	private static final int CLARITY_HIGH_BOUNDERY = 3;
	private static final String FILENAME = "resources" + File.separator + "inputData.txt";
	private final static Logger LOGGER = LogManager.getLogger();
	public static void main(String[] args) {

		//Read data from file
		List<String> lines = null;
			try {
				lines = ReadFile.readLinesFromFile(FILENAME);
			} catch (FileReadException e) {
				LOGGER.error("File with decor elements is not available");
				e.printStackTrace();
			}

		Necklace neck = NecklaceBuilder.buildNecklace(lines);

		//Print original elements
		System.out.println("\n===== Original Decor Elements =====");
		neck.getDecorElements().forEach(System.out::println);
		System.out.println("===================================");
		
		//Calculate Total Cost and Mass
		System.out.println("\n===== Calculate Total Mass and Cost =====");
		System.out.printf("GemMass = %.1f carats.\n", NecklaceAction.calculateGemMass(neck));
		System.out.printf("NecklaceCost = $%.2f\n", NecklaceAction.calculateNeckalceCost(neck));
		System.out.println("=========================================");
		
		//Sort by Cost
		System.out.println("\n===== Sort by Cost =====");
		NecklaceAction.sortDecorByCost(neck);
		neck.getDecorElements().forEach(x -> System.out.printf("COST=$%.2f. %s\n", x.calculateCost(), x));		
		System.out.println("=========================");

		//Sort by Name and Cost
		System.out.println("\n===== Sort by Name and Cost =====");
		NecklaceAction.sortDecorByNameAndCost(neck);
		neck.getDecorElements().forEach(x -> System.out.printf("NAME=%s, COST=$%.2f. %s\n", x.convertNameToString(), x.calculateCost(), x));
		System.out.println("=================================");
		
		//Filter by Clarity
		System.out.printf("\n===== Filter by Clarity between %d and %d =====\n", CLARITY_LOW_BOUNDERY, CLARITY_HIGH_BOUNDERY);
		List<Decor> d = NecklaceAction.filterDecorByClarity(neck, CLARITY_LOW_BOUNDERY, CLARITY_HIGH_BOUNDERY);
		d.forEach(System.out::println);
		System.out.println("=============================================");
		
	}
}
