package Easy.R;

import java.util.Scanner;

public class rijeci {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int presses = myScanner.nextInt();

        long a = 1, b = 0;

        for (int i = 1; i <= presses; i++) {
            long newA = b;
            long newB = a + b;
            a = newA;
            b = newB;
        }

        System.out.println(a + " " + b);
    }
}
