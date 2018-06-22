package src.com.gabriel;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int row = 1; row <= number; row++) {
            System.out.print("*");
            for (int columns = 2; columns <= number; columns++) {
                if (row == 1 || row == number) {
                    System.out.print("*");
                } else if (columns == 1 || columns == number) {
                    System.out.print("*");
                } else if (row == columns) {
                    System.out.print("*");
                } else if (columns == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
