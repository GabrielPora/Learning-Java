package src.com.gabriel;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int last) {
        if ((first < 10 || first > 1000) || (second < 10 || second > 1000) || (last < 10 || last > 1000)) {
            return false;
        }
        int f1 = first % 10;
        int s1 = second % 10;
        int l1 = last % 10;
        if ((f1 == l1) || (f1 == s1) || (s1 == l1)) {
            return true;
        } else {
            return false;
        }
    }
}
