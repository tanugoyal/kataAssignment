package com.stringcalculator;

import com.exception.CustomisedException;

import java.util.ArrayList;
import java.util.List;

/*
 * Searches the negative number if negative num are present then throws customised exception*/
class NegativeNumberSearcher implements ForbiddenNumbers {

    public void validate(List<Integer> numbers) throws CustomisedException {
        List<Integer> negativeNumbers = getNegativeNumbers(numbers);
        if (negativeNumbers.size() > 0) {
            throw new CustomisedException(negativeNumbers);
        }
    }

    private List<Integer> getNegativeNumbers(List<Integer> numbers) {
        List<Integer> negativeNumbers = new ArrayList<Integer>();
        for (Integer num : numbers) {
            if (num < 0) {
                negativeNumbers.add(num);
            }
        }
        return negativeNumbers;
    }

}
