package com.bibik.project2.runner;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibik.project2.action.NecklaceAction;
import com.bibik.project2.entity.Decor;
import com.bibik.project2.entity.DecorFactory;
import com.bibik.project2.entity.Necklace;
import com.bibik.project2.exception.DecorFactoryException;
import com.bibik.project2.exception.FileReadException;
import com.bibik.project2.lineparser.LineParser;
import com.bibik.project2.readfile.ReadFile;
import com.bibik.project2.validation.DataValidation;

public class Runner {
	public static final int CLARITY_LOW_BOUNDERY = 1;
	public static final int CLARITY_HIGH_BOUNDERY = 3;
	private static final String FILENAME = "resources" + File.separator + "inputData.txt";
	private final static Logger LOGGER = LogManager.getLogger();
	private static final String SEPARATOR = ";"; 

	public static void main(String[] args) {
		
		//Read data from file
		List<String> lines = null;
			try {
				lines = ReadFile.readLinesFromFile(FILENAME);
			} catch (FileReadException e) {
				LOGGER.error("File with decor elements is not available");
				e.printStackTrace();
			}

		Necklace neck = new Necklace();
		
		for(String line : lines) {
			//Parse line
			String[] parsedLine = LineParser.parseLine(line, SEPARATOR);
			
			//Validate data in line
			LOGGER.info("Validate line: " + line);
			if(DataValidation.validateData(parsedLine)){
				try {
					//Add Decor to Necklace
					neck.newDecorElement(DecorFactory.createDecor(parsedLine));
				} catch (DecorFactoryException e) {
					LOGGER.error(e.getMessage() + line);
				}
			};
		}

		//Print original elements
		System.out.println("\n===== Original Decor Elements =====");
		neck.getDecorElements().forEach(System.out::println);
		System.out.println("===================================");
		
		//Calculate Total Cost and Mass
		System.out.println("\n===== Calculate Total Mass and Cost =====");
		System.out.printf("GemMass = %.1f carats.\n", neck.calculateGemMass());
		System.out.printf("NecklaceCost = $%.2f\n", neck.calculateNeckalceCost());
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
