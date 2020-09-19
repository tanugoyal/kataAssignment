package com.stringcalculator;



import java.util.List;

import com.exception.CustomisedException;

/**
 * Interface created to represent a validator that evaluates a list of integers.
 */
interface ForbiddenNumbers {

    void validate(List<Integer> numbers) throws CustomisedException;
    
}
