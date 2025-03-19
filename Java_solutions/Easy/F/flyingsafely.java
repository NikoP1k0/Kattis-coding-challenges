package Easy.F;

import java.util.Scanner;

public class flyingsafely {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();

        while (testCases-- > 0) {
            int cities = myScanner.nextInt();
            int flights = myScanner.nextInt();

            for (int i = 0; i < flights; i++) {
                int a = myScanner.nextInt();
                int b = myScanner.nextInt();
            }

            // The minimum number of pilots required = (number of cities - 1)
            System.out.println(cities - 1);
        }

    }
}
