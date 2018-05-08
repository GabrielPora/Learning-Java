package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    public int add(String inputNumbers) {
        int sum = 0;
        if (inputNumbers.isEmpty()) {
            sum = 0;
        } else {
            String[] textNumbers = extractNumberIntoArray(inputNumbers);
            sum = sumNumbers(textNumbers);
        }
        return sum;
    }

    public String[] extractNumberIntoArray(String inputNumbersString) {
        String[] textNumbers;
        if (inputNumbersString.startsWith("//")) {
            Matcher matchTextNumbers = Pattern.compile("//(.)\n(.*)").matcher(inputNumbersString);
            matchTextNumbers.find();

            String customDelimiter = matchTextNumbers.group(1);
            textNumbers = matchTextNumbers.group(2).split(customDelimiter);
        }
        else {
            textNumbers = inputNumbersString.split(",|\n");
        }
        return textNumbers;
    }

    public int sumNumbers(String[] textNumbers) {
        int sum = 0;
        for (String textNum: textNumbers) {
            sum += Integer.parseInt(textNum);
        }
        return sum;
    }
}
