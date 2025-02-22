package Easy.D;

import java.util.Scanner;

public class dicegame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read Gunnar's dice
        int a1 = scanner.nextInt(), b1 = scanner.nextInt();
        int a2 = scanner.nextInt(), b2 = scanner.nextInt();

        // Read Emma's dice
        int c1 = scanner.nextInt(), d1 = scanner.nextInt();
        int c2 = scanner.nextInt(), d2 = scanner.nextInt();

        scanner.close();

        // Compute all possible sums for both players
        int[] gunnarSums = new int[201]; // Possible sum range: 2 to 200
        int[] emmaSums = new int[201];

        // Populate frequency arrays
        for (int i = a1; i <= b1; i++) {
            for (int j = a2; j <= b2; j++) {
                gunnarSums[i + j]++;
            }
        }

        for (int i = c1; i <= d1; i++) {
            for (int j = c2; j <= d2; j++) {
                emmaSums[i + j]++;
            }
        }

        // Count winning probabilities
        int gunnarWins = 0, emmaWins = 0;

        for (int gSum = 2; gSum <= 200; gSum++) {
            for (int eSum = 2; eSum < gSum; eSum++) {
                gunnarWins += gunnarSums[gSum] * emmaSums[eSum];
            }
            for (int eSum = gSum + 1; eSum <= 200; eSum++) {
                emmaWins += gunnarSums[gSum] * emmaSums[eSum];
            }
        }

        // Output the result
        if (gunnarWins > emmaWins) {
            System.out.println("Gunnar");
        } else if (emmaWins > gunnarWins) {
            System.out.println("Emma");
        } else {
            System.out.println("Tie");
        }
    }
}
