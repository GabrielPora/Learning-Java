package src.com.gabriel;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = number * -1;
        }
        int temp = number;
        int reverse = 0;
        int lastDigit;
        while (temp > 0) {
            lastDigit = temp % 10;
            reverse += lastDigit;
            reverse *= 10;
            temp = temp / 10;
        }
        reverse /= 10;
//        System.out.println(reverse);
        if (reverse == number) {
            return true;
        } else {
            return false;
        }

    }
}
