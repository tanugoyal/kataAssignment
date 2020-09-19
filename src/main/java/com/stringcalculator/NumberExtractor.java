package com.stringcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class created to work as a number extractor. This class will receive a string with some numbers inside and will
 * extract it in a number collection.
 *
 */
class NumberExtractor {

    private static final String REG_EX_IGNORE_DELIMITERS = "-?\\d+";
    private static final Pattern NUMBER_PATTERN = Pattern.compile(REG_EX_IGNORE_DELIMITERS);

    /**
     * Analyze the string passed as parameter searching numbers and return a list with all of them
     *
     * @param stringToAnalyze can contains different separators and numbers with more than one digit.
     * @return a List<Integer> with the numbers found
     */
    public List<Integer> extract(final String stringToAnalyze) {
        List<Integer> result = new ArrayList<Integer>();
        if (stringToAnalyze != null && !stringToAnalyze.isEmpty()) {
            result = getNumbersUsingRegEx(stringToAnalyze);
        }
        return result;
    }

    private List<Integer> getNumbersUsingRegEx(String string) {
        Matcher matcher = NUMBER_PATTERN.matcher(string);
        return extractNumbersFromMatcher(matcher);
    }

    private List<Integer> extractNumbersFromMatcher(Matcher matcher) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (matcher.find()) {
            int number = Integer.parseInt(matcher.group());
            numbers.add(number);
        }
        return numbers;
    }

}
