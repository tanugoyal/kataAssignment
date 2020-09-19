package com.common;

import java.util.ArrayList;
import java.util.List;


public class NumberValidator {
	/*
	 * Removes the invalid numbers from the list of integers which are currebtly num >1000
	 * */
	public List<Integer> removeInvalidNumbers(List<Integer> numbers) throws Exception {
		List<Integer> resNumbers = new ArrayList<Integer>();
			for(Integer num : numbers){
				if(isValid(num)){
					resNumbers.add(num);
				}
		}
		return resNumbers;
	}
    
	public boolean isValid(Integer num){
		if(num>=1000)
			return false;
		return true;
	}

}
