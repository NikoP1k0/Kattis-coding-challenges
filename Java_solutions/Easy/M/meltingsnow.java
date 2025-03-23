package Easy.M;

import java.util.Scanner;

public class meltingsnow {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int S = myScanner.nextInt();
        int P = myScanner.nextInt();

        double maxSnow = (100.0 * S) / P;
        System.out.printf("%.6f\n", maxSnow);
    }
}
