package org.futurecollars.lesson10task4choosingNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPicker {

    public static void main(String[] args) {
        String numbers = "342\n" +
                "\n" +
                "5.34\n" +
                "\n" +
                "756\n" +
                "\n" +
                "1.234e+07\n" +
                "\n" +
                "7.234243E-02\n" +
                "\n" +
                "6.09\n" +
                "\n" +
                "3457\n" +
                "\n" +
                "87\n" +
                "\n" +
                "1.0001\n" +
                "\n" +
                "3\n" +
                "\n" +
                "5";

        Pattern patternIntegers = Pattern.compile("(?<!\\S)\\d+(?!\\S)");
        Matcher matcher = patternIntegers.matcher(numbers);
        List<String> integerList = new ArrayList<>();

        while (matcher.find()) {
            integerList.add(matcher.group());
        }
        System.out.println(integerList);

        Pattern patternFloatingPointNumbers = Pattern.compile("\\b\\d+\\.\\d+\\b");
        Matcher matcherFloat = patternFloatingPointNumbers.matcher(numbers);

        List<String> floatList = new ArrayList<>();

        while (matcherFloat.find()) {
            floatList.add(matcherFloat.group());
        }
        System.out.println(floatList);

        Pattern patternNumbersScientificNotation = Pattern.compile("\\b\\d+\\.\\d+([eE][+-])\\d\\d");
        Matcher matcherScientificNotation = patternNumbersScientificNotation.matcher(numbers);

        List<String> scientificNotationList = new ArrayList<>();

        while (matcherScientificNotation.find()){
            scientificNotationList.add(matcherScientificNotation.group());
        }
        System.out.println(scientificNotationList);

    }

}
