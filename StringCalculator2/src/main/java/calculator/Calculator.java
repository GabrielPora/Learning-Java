package calculator;

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
        String[] textNumbers = inputNumbersString.split(",");
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
