package Easy.S;

import java.util.Scanner;

public class sumsquareddigits {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int dataSetNumber = myScanner.nextInt();
            int base = myScanner.nextInt();
            int number = myScanner.nextInt();

            int ssd = computeSSD(number, base);
            System.out.println(dataSetNumber + " " + ssd);
        }
    }

    private static int computeSSD(int number, int base) {
        int sum = 0;

        while (number > 0) {
            int digit = number % base; // Get the last digit in base B
            sum += digit * digit;      // Square and add to sum
            number /= base;            // Remove last digit
        }

        return sum;
    }
}
