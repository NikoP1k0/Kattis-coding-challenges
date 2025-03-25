package Easy.T;

import java.util.Scanner;

public class tetration {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double a = myScanner.nextDouble();
        double result = Math.pow(a, 1.0 / a);  // Compute a^(1/a)
        System.out.printf("%.6f%n", result);  // Print with 6 decimal places
    }
}
