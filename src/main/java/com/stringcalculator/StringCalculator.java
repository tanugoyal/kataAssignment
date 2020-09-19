package com.stringcalculator;


import java.util.List;

import com.exception.CustomisedException;

public class StringCalculator {


    private NumberExtractor numberExtractor;
    private ForbiddenNumbers forbiddenNumbers;

    public StringCalculator() {
    	this.numberExtractor = new NumberExtractor();
    	this.forbiddenNumbers = new NegativeNumberSearcher();
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


    private int sumNumbers(List<Integer> numberList) {
        int sum = 0;
        for (Integer num : numberList) {
            sum += num;
        }
        return sum;
    }
}
