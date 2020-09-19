package com.stringcalculator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;


@RunWith(DataProviderRunner.class)
public class StringCalculatorTest {

	@Test
	@UseDataProvider("validateString")
    public void testValidateString(String numbers,int result) throws Exception
    {
		StringCalculator stringCalculator = new StringCalculator();
    	 assertEquals(result, stringCalculator.add(numbers));;
    }
	
	 @DataProvider
	    public static Object[][] validateString() {
	        return new Object[][] {
	                         { "/n1,2", 3 },
	                         {"",0},
	                         {"$#@$&&1*****12",13},
	                         {"$#@$&&/n/r1*****12",13},
	                         {"21,12",33},
	                         
	         };
	    }
 

}
