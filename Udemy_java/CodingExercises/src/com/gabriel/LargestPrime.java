package src.com.gabriel;

public class LargestPrime {
//    some student answer
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int highPrime = 0;
        boolean isPrime = true;
        int count = 2;
        while (count <= number) {
            if (number % count == 0) {
                for (int j = 2; j < count; j++) {
                    if (count % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    highPrime = count;
                }
            }
            count++;
        }
        return highPrime;

    }

//    My answer
//    public static int getLargestPrime(int number) {
//        if (number < 2) {
//            return -1;
//        }
//        if (isPrime(number)){
//            return number;
//        }
//        int highPrime = 0;
//        int count = 2;
//        while (count <= number/2) {
//            if (isPrime(count)) {
//                if (number%count==0){
//                    highPrime = count;
//                }
//            }
//            count++;
//        }
//        if (highPrime!=0){
//            return highPrime;
//        }
//        return -1;
//
//    }
//
//    public static boolean isPrime(int number) {
//        if (number == 1) {
//            return false;
//        }
//        for (int i = 2; i <= (long) Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}
