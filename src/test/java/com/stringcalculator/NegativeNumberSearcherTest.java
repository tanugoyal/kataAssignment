package com.stringcalculator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.exception.CustomisedException;

public class NegativeNumberSearcherTest {
    private static final int POSITIVE_VALUE = 100;
    private static final int ZERO = 0;
    private static final int NEGATIVE_VALUE = -11;

    private NegativeNumberSearcher validator;

    @Before
    public void setUp() {
        initializeRule();
    }

    @Test
    public void shouldValidatePositiveNumbers() throws CustomisedException {
        List<Integer> positiveNumbers = generateIntegerList(POSITIVE_VALUE);
        validator.validate(positiveNumbers);
    }

    @Test
    public void shouldValidateZero() throws CustomisedException {
        List<Integer> positiveNumbers = generateIntegerList(ZERO);
        validator.validate(positiveNumbers);
    }


    @Test(expected = CustomisedException.class)
    public void shouldNotValidateNegativeNumbers() throws CustomisedException {
        List<Integer> positiveNumbers = generateIntegerList(NEGATIVE_VALUE);
        validator.validate(positiveNumbers);
    }

    private void initializeRule() {
        validator = new NegativeNumberSearcher();
    }

    private List<Integer> generateIntegerList(int num) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(num);
        return nums;
    }
}
