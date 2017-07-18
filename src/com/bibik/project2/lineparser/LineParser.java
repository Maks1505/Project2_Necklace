package com.bibik.project2.lineparser;

public class LineParser {
	 
	public static String[] parseLine(String line, String separator) {
		String[] str = line.split(separator);
		return str ;
	}
}
