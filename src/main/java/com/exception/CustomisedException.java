package com.exception;

import java.util.List;

public class CustomisedException extends Exception {

    private static final String EXCEPTION_NAME = "Negative numbers are not supported";

    private List<Integer> negativeNumbers;

    public CustomisedException(List<Integer> negativeNumbers) {
        this.negativeNumbers = negativeNumbers;
    }

    public static String getExceptionName() {
        return EXCEPTION_NAME;
    }

    @Override
    public String getMessage() {
        return EXCEPTION_NAME + negativeNumbers.toString();
    }
}
