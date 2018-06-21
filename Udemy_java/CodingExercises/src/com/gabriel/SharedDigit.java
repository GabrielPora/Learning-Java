package src.com.gabriel;

public class SharedDigit {
    public static boolean hasSharedDigit(int first, int last) {
        if ((first < 10 || first > 99) || (last < 10 || last > 99)) {
            return false;
        }
        int tmp1 = first;
        int f1 = tmp1 % 10;
        tmp1 = tmp1 / 10;
        int f2 = tmp1 % 10;
        int tmp2 = last;
        int l1 = tmp2 % 10;
        tmp2 = tmp2 / 10;
        int l2 = tmp2 % 10;
        if ((f1 == l1) || (f1 == l2) || (f2 == l1) || (f2 == l2)) {
            return true;
        } else {
            return false;
        }
    }
}
