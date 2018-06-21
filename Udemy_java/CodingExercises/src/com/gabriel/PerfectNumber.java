package src.com.gabriel;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        int count = 1;
        while (count <= number / 2) {
            if (number % count == 0) {
                sum += count;
            }
            count++;
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }
}
