package com.bibik.project2.entity.decor;

import com.bibik.project2.exception.DecorTypeException;

public enum EnumDecorType {
	PRECIOUS_GEMSTONE, AMBER, PEARL, MATERIAL;
	
	public static EnumDecorType getDecorType(String s) throws DecorTypeException{
		EnumDecorType decorType = null;
		try {
			decorType = EnumDecorType.valueOf(s);
		} catch (IllegalArgumentException e) { 
			throw new DecorTypeException("Illegal decor type: " + s, e);
		}
		return decorType;
	}
}
