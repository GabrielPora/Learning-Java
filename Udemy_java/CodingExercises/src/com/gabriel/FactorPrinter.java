package src.com.gabriel;

public class FactorPrinter {
    public static void printFactors(int number){
        if (number<1){
            System.out.println("Invalid Value");
            return;
        }
        String temp = "";
        int count = 1;
        while (count<= number/2){
            if (number%count==0){
                temp += count+" ";
            }
            count++;
        }
        temp += number;
        System.out.println(temp);
    }
}
