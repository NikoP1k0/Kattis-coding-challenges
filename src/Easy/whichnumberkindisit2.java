package Easy;

import java.util.Scanner;

public class whichnumberkindisit2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int number = myScanner.nextInt();
            boolean isOdd = (number % 2 != 0);
            boolean isSquare = (Math.sqrt(number) % 1 == 0);

            if (isOdd && isSquare) {
                System.out.println("OS");
            } else if (isOdd) {
                System.out.println("O");
            } else if (isSquare) {
                System.out.println("S");
            } else {
                System.out.println("EMPTY");
            }
        }
    }
}
