package com.stringcalculator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class NumberExtractorTest {
	 private static final String NO_NUMBERS = "asdf";
	    private static final String NUMBERS_WITH_DIFFERENT_DELIMITERS = "\n|·1,2,3,pouusdf4%5&6";

	    private NumberExtractor numberExtractor;

	    @Before
	    public void setUp() {
	        initializeNumberExtractor();
	    }

	    @Test
	    public void returnEmptyListIfParamIsNull() {
	        List<Integer> result = numberExtractor.extract(null);
	        List<Integer> expectedResult = new ArrayList<Integer>();
	        assertEquals(expectedResult, result);
	    }

	    @Test
	    public void returnEmptyListIfParamIsEmpty() {
	        List<Integer> result = numberExtractor.extract("");
	        List<Integer> expectedResult = new ArrayList<Integer>();
	        assertEquals(expectedResult, result);
	    }

	    @Test
	    public void returnEmptyListNoNumInsideTheString() {
	        List<Integer> result = numberExtractor.extract(NO_NUMBERS);
	        List<Integer> expectedResult = new ArrayList<Integer>();
	        assertEquals(expectedResult, result);
	    }

	    @Test
	    public void returnNumbersExtracted() {
	        List<Integer> result = numberExtractor.extract(NUMBERS_WITH_DIFFERENT_DELIMITERS);
	        List<Integer> expectedResult = generateListOfNumbers(1, 2, 3, 4, 5, 6);
	        assertEquals(expectedResult, result);
	    }

	    private void initializeNumberExtractor() {
	        numberExtractor = new NumberExtractor();
	    }

	    private List<Integer> generateListOfNumbers(Integer... nums) {
	        List<Integer> result = new ArrayList<Integer>();
	        for (Integer num : nums) {
	            result.add(num);
	        }
	        return result;
	    }
}
