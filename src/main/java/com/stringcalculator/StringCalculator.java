package com.stringcalculator;


import java.util.List;

public class StringCalculator {


    private NumberExtractor numberExtractor;

    public StringCalculator() {
    	this.numberExtractor = new NumberExtractor();
    }

    public int add(final String numbers) throws Exception {
        List<Integer> numbersList = extractNumbers(numbers);
        return sumNumbers(numbersList);
    }
    private List<Integer> extractNumbers(final String numbers) {
        return numberExtractor.extract(numbers);
    }

    private int sumNumbers(List<Integer> numberList) {
        int sum = 0;
        for (Integer num : numberList) {
            sum += num;
        }
        return sum;
    }
}
