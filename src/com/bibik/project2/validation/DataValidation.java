package com.bibik.project2.validation;

import org.apache.logging.log4j.LogManager;

import com.bibik.project2.entity.EnumAmberClass;
import com.bibik.project2.entity.EnumDecorType;
import com.bibik.project2.entity.EnumGemstone;
import com.bibik.project2.entity.EnumMaterial;
import com.bibik.project2.entity.EnumPearlClass;
import com.bibik.project2.exception.DecorTypeException;

import org.apache.logging.log4j.Logger;


public class DataValidation {
	private final static Logger LOGGER = LogManager.getLogger();
	
	public static EnumDecorType getDecorType(String s) {
		EnumDecorType decorType = null;
		try {
			decorType = EnumDecorType.getDecorType(s);
		} catch (DecorTypeException e) {
			LOGGER.warn(e.getMessage()); 
		}
		return decorType;
	}

	
	public static boolean checkNumberOfElementsInRow(String[] parsedLine, int num) {
		if (parsedLine.length != num) {
			LOGGER.warn("Wrong number of decor element parameters.");
		}
		return parsedLine.length == num;
	}
	
	
	public static boolean isAmberDataValid(String[] parsedLine){
		boolean res = false;
		try {
			EnumAmberClass.valueOf(parsedLine[1].trim());
			Integer.parseInt(parsedLine[2].trim());
			Integer.parseInt(parsedLine[3].trim());
			res = true;
		} catch (IllegalArgumentException e) {
			LOGGER.warn("Amber data is not valid.");
		}
		return res;
	}
	
	
	public static boolean isMaterialDataValid(String[] parsedLine){
		boolean res = false;
		try {
			EnumMaterial.valueOf(parsedLine[1].trim());
			Integer.parseInt(parsedLine[2].trim());
			res = true;
		} catch (IllegalArgumentException e) {
			LOGGER.warn("Material data is not valid.");
		}
		return res;
	}
	
	
	public static boolean isPearlDataValid(String[] parsedLine){
		boolean res = false;
		try {
			EnumPearlClass.valueOf(parsedLine[1].trim());
			Integer.parseInt(parsedLine[2].trim());
			res = true;
		} catch (IllegalArgumentException e) {
			LOGGER.warn("Pearl data is not valid.");
		}
		return res;
	}
	
	
	public static boolean isPreciousGemstoneDataValid(String[] parsedLine){
		boolean res = false;
		try {
			EnumGemstone.valueOf(parsedLine[1].trim());
			Integer.parseInt(parsedLine[2].trim());
			Double.parseDouble(parsedLine[3].trim());
			Boolean.parseBoolean(parsedLine[4].trim());
			Integer.parseInt(parsedLine[5].trim());
			res = true;
		} catch (IllegalArgumentException e) {
			LOGGER.warn("Precious gemstone data is not valid.");
		}
		return res;
	}
	
	
	public static boolean validateData(String[] parsedLine) {
		boolean checkNumElem = false;
		EnumDecorType decorType = getDecorType(parsedLine[0]);
		if (decorType != null) {
			switch (decorType.name().toUpperCase()) {
				case "AMBER": 
					if (checkNumElem = checkNumberOfElementsInRow(parsedLine, 4)) {
						checkNumElem = isAmberDataValid(parsedLine);
					}
					break;
				case "MATERIAL": 
					if (checkNumElem = checkNumberOfElementsInRow(parsedLine, 3)) {
						checkNumElem = isMaterialDataValid(parsedLine);
					}
					break;
				case "PEARL": 
					if (checkNumElem = checkNumberOfElementsInRow(parsedLine, 3)) {
						checkNumElem = isPearlDataValid(parsedLine);
					}
					break;
				case "PRECIOUS_GEMSTONE": 
					if (checkNumElem = checkNumberOfElementsInRow(parsedLine, 6)) {
						checkNumElem = isPreciousGemstoneDataValid(parsedLine);
					}
					break; 
				default: checkNumElem = false;
			}
		}
		return checkNumElem;
	}
	
}
