package src.com.gabriel;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        String word = "";
        int digitCount = getDigitCount(number);
        int reverseNum = reverse(number);
        while (digitCount > 0) {
            switch (reverseNum % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("OTHER");
                    break;
            }
            reverseNum /= 10;
            digitCount--;
        }
//        System.out.println(word);

    }

    public static int reverse(int number) {
        int temp = number;
        if (number < 0) {
            temp = temp * -1;
        }
        int reverseNum = 0;
        int lastDigit;
        while (temp > 0) {
            lastDigit = temp % 10;
            reverseNum += lastDigit;
            reverseNum *= 10;
            temp = temp / 10;
        }
        reverseNum /= 10;
        if (number < 0) {
            return reverseNum * -1;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        String temp = Integer.toString(number);
        int lengthOfNumber = temp.length();
        return lengthOfNumber;
    }
}
