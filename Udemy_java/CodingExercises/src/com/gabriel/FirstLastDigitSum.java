package src.com.gabriel;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        if (number <= 9) {
            return number + number;
        }
        String temp = Integer.toString(number);
        int lengthOfNumber = temp.length() - 1;
        int placeHolderForFirstDigit = (int) Math.pow(10, lengthOfNumber);
        int firstDigit = number / placeHolderForFirstDigit;
        int lastDigit = number % 10;
        int sum = lastDigit + firstDigit;
        return sum;
    }
}
