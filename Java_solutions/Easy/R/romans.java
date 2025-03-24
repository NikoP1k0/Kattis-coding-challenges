package Easy.R;

import java.util.Scanner;

public class romans {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double englishMiles = myScanner.nextDouble();

        // Conversion factor: 1000 * 5280 / 4854
        double romanPaces = englishMiles * (1000 * 5280.0 / 4854.0);
        long result = Math.round(romanPaces);

        System.out.println(result);
    }
}
