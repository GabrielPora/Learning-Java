package src.com.gabriel;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int big = 5 * bigCount;
        int small = 1 * smallCount;
        int sum = big + small;
        if(sum==goal){
            return true;
        } else if (sum< goal){
            return false;
        }else if(smallCount == 0){
            return false;
        }
        int mod = goal%5;
        if(smallCount>=mod){
            return true;
        }
        return false;
    }
}
