package com.bibik.project2.readfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import com.bibik.project2.exception.FileReadException;

public class ReadFile {
	
	public static List<String> readLinesFromFile(String fileName) throws FileReadException {
		List<String> fileContent = new ArrayList<>();

		try {
			fileContent = Files.readAllLines(Paths.get(fileName));
		} catch (IOException e) {
			throw new FileReadException("Decore elements file error. ", e);
		}
		return fileContent;
	}
}
