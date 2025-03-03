package Easy.C;

import java.util.Scanner;

public class conundrum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cipherText = scanner.nextLine().toUpperCase();
        String target = "PER";
        int days = 0;

        // Iterate through the cipher text
        for (int i = 0; i < cipherText.length(); i++) {
            // Compare each character with the corresponding character in the target string
            if (cipherText.charAt(i) != target.charAt(i % 3)) {
                days++; // If they don't match, we need a day to change it
            }
        }

        // Output the result
        System.out.println(days);
    }
}
