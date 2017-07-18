package com.bibik.project2.entity.necklace;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bibik.project2.entity.decor.DecorFactory;
import com.bibik.project2.exception.DecorFactoryException;
import com.bibik.project2.lineparser.LineParser;
import com.bibik.project2.validation.DataValidation;

public class NecklaceBuilder {
	private final static Logger LOGGER = LogManager.getLogger();
	private static final String SEPARATOR = ";";
	
	public static Necklace buildNecklace(List<String> lines){
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
		return neck;
	}
}
