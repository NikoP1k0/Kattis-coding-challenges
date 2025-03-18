package Easy.B;

import java.util.Scanner;

public class bottleopening {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int k = myScanner.nextInt();

        if (k >= n) {
            System.out.println("impossible");
        } else {
            // Open K bottles using the next available unopened bottle
            for (int i = 1; i <= k; i++) {
                System.out.println("open " + i + " using " + (k + 1));
            }
        }
    }
}
