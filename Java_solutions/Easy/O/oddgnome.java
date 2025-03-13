package Easy.O;

import java.util.Scanner;

public class oddgnome {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int numGroups = myScanner.nextInt();

        // Iterate over each group
        for (int groupIndex = 0; groupIndex < numGroups; groupIndex++) {
            int n = myScanner.nextInt(); // Number of gnomes in this group
            int[] gnomes = new int[n];

            // Read the gnome IDs
            for (int i = 0; i < n; i++) {
                gnomes[i] = myScanner.nextInt();
            }

            // Find the king
            for (int i = 1; i < n - 1; i++) { // We know the king is never first or last
                if (gnomes[i] != gnomes[i - 1] + 1) {
                    // We found the king, print the 1-based index
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}
