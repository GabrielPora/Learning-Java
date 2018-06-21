package src.com.gabriel;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int common = 1;
        int count = 1;
        int n = first;
        if (first>second){
            n = second;
        }
        while (count <= n) {
            if ((first % count) == 0 && (second % count == 0)) {
                common = count;
            }
            count++;
        }
        return common;
    }
}
