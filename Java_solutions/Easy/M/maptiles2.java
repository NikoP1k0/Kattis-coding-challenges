package Easy.M;

import java.util.Scanner;

public class maptiles2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String quadkey = myScanner.nextLine();

        int zoomLevel = quadkey.length();
        int x = 0, y = 0;

        // Process each digit of the quadkey
        for (int i = 0; i < zoomLevel; i++) {
            int digit = quadkey.charAt(i) - '0'; // Convert char to integer
            x = x * 2 + (digit % 2);  // Update x based on the digit
            y = y * 2 + (digit / 2);  // Update y based on the digit
        }

        // Output the zoom level and coordinates (x, y)
        System.out.println(zoomLevel + " " + x + " " + y);
    }
}
