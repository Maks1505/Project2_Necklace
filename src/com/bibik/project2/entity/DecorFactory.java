package com.bibik.project2.entity;

import com.bibik.project2.exception.DecorFactoryException;

public class DecorFactory {

	public static Decor createDecor(String[] parsedLine) throws DecorFactoryException{
		EnumDecorType decType = EnumDecorType.valueOf(parsedLine[0]);
		Decor d1;
		switch (decType.name().toUpperCase()) {
			case "AMBER": 
				d1 = new Amber(EnumAmberClass.valueOf(parsedLine[1].trim()), Integer.parseInt(parsedLine[2].trim()), Integer.parseInt(parsedLine[3].trim()));
				break;
			case "PEARL":
				d1 = new Pearl(EnumPearlClass.valueOf(parsedLine[1].trim()), Integer.parseInt(parsedLine[2].trim()));
				break;
			case "MATERIAL":
				d1 = new Material(EnumMaterial.valueOf(parsedLine[1].trim()), Integer.parseInt(parsedLine[2].trim()));
				break;
			case "PRECIOUS_GEMSTONE":
				d1 = new PreciousGemstone(EnumGemstone.valueOf(parsedLine[1].trim()), Integer.parseInt(parsedLine[2].trim()), Double.parseDouble(parsedLine[3].trim()), Boolean.parseBoolean(parsedLine[4].trim()), Integer.parseInt(parsedLine[5].trim()));
				break;
			default: d1 = null;
		}
		if (d1 != null) {
			return d1;
		} else {
			throw new DecorFactoryException("Decor factory error. Cannot create new decor element. ");
		}
	}
	
}
