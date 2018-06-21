package src.com.gabriel;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if (number < 0) {
            return -1;
        }
        int temp = number;
        int sum = 0;
        int lastDigit;
        while (temp > 0) {
            lastDigit = temp % 10;
            if (lastDigit%2 ==0){
                sum += lastDigit;
            }
            temp = temp / 10;
        }
        return sum;

    }
}
