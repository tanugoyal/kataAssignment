package com.stringcalculator;


import java.util.List;

import com.common.NumberValidator;
import com.exception.CustomisedException;
/*
 * This class is used to sum up all the numbers present in a string
 * It ignores all the delimiters new lines in a string
 * It also ignores the num>1000.
 * if there are negative num then exception will be thrown
 * */
public class StringCalculator {


    private NumberExtractor numberExtractor;
    private ForbiddenNumbers forbiddenNumbers;
    private NumberValidator numberValidator;

    public StringCalculator() {
    	this.numberExtractor = new NumberExtractor();
    	this.forbiddenNumbers = new NegativeNumberSearcher();
    	this.numberValidator = new NumberValidator();
    }

    public int add(final String numbers) throws Exception {
        List<Integer> numbersList = extractNumbers(numbers);
        checkIfThereAreNegativeNumbers(numbersList);
        return sumNumbers(numbersList);
    }
    private List<Integer> extractNumbers(final String numbers) {
        return numberExtractor.extract(numbers);
    }
    private void checkIfThereAreNegativeNumbers(List<Integer> numbersList) throws CustomisedException {
        forbiddenNumbers.validate(numbersList);
    }
    private List<Integer> validateNumbers(List<Integer> numbersList) throws Exception {
        return numberValidator.removeInvalidNumbers(numbersList);
    }


    private int sumNumbers(List<Integer> numberList) {
        int sum = 0;
        for (Integer num : numberList) {
            sum += num;
        }
        return sum;
    }
}
