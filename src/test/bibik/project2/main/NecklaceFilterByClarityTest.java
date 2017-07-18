package test.bibik.project2.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.bibik.project2.action.NecklaceAction;
import com.bibik.project2.entity.Decor;
import com.bibik.project2.entity.Necklace;
import com.bibik.project2.entity.NecklaceBuilder;
import com.bibik.project2.exception.FileReadException;
import com.bibik.project2.readfile.ReadFile;

public class NecklaceFilterByClarityTest {

	@Test
	public void test() {
		final int CLARITY_LOW_BOUNDERY = 1;
		final int CLARITY_HIGH_BOUNDERY = 3;
		final String TEST_FILENAME = "resources" + File.separator + "TestData" + File.separator + "SortByClarityTest.txt";
		final String TEST_RESULT_FILENAME = "resources" + File.separator + "TestData" + File.separator + "SortByClarityTestResult.txt";

		
		//Create actual Necklace from Test file
		List<String> actualLines = null;
		try {
			actualLines = ReadFile.readLinesFromFile(TEST_FILENAME);
		} catch (FileReadException e1) {
			e1.printStackTrace();
		}
		Necklace actualNecklace = NecklaceBuilder.buildNecklace(actualLines);
		Object[] actualArray  = NecklaceAction.filterDecorByClarity(actualNecklace, CLARITY_LOW_BOUNDERY, CLARITY_HIGH_BOUNDERY).toArray();
		
		
		//Create expected Necklace from Test Result file
		List<String> expectedLines = null;
		try {
			expectedLines = ReadFile.readLinesFromFile(TEST_RESULT_FILENAME);
		} catch (FileReadException e1) {
			e1.printStackTrace();
		}
		Necklace expectedNecklace = NecklaceBuilder.buildNecklace(expectedLines);
		Object[] expectedArray  = expectedNecklace.getDecorElements().toArray(); 

		Assert.assertArrayEquals(expectedArray, actualArray);
	}

}
