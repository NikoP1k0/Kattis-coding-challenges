package Easy.S;

import java.util.Scanner;

public class secretmessage {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int N = myScanner.nextInt();
        myScanner.nextLine();

        for (int i = 0; i < N; i++) {
            String message = myScanner.nextLine();
            String encryptedMessage = encryptMessage(message);
            System.out.println(encryptedMessage);
        }
    }

    public static String encryptMessage(String message) {
        int L = message.length();
        int M = findSmallestSquareGreaterThanEqualTo(L);  // Find M

        // Step 1: Pad the message with asterisks
        String paddedMessage = message + "*".repeat(M - L);

        // Step 2: Create the K x K table
        int K = (int) Math.sqrt(M);
        char[][] table = new char[K][K];

        // Fill the table in row-major order
        int idx = 0;
        for (int row = 0; row < K; row++) {
            for (int col = 0; col < K; col++) {
                table[row][col] = paddedMessage.charAt(idx++);
            }
        }

        // Step 3: Rotate the table 90 degrees clockwise
        char[][] rotatedTable = new char[K][K];
        for (int row = 0; row < K; row++) {
            for (int col = 0; col < K; col++) {
                rotatedTable[col][K - 1 - row] = table[row][col];
            }
        }

        // Step 4: Read the rotated table in row-major order and build the result
        StringBuilder encryptedMessage = new StringBuilder();
        for (int row = 0; row < K; row++) {
            for (int col = 0; col < K; col++) {
                if (rotatedTable[row][col] != '*') {  // Omit asterisks
                    encryptedMessage.append(rotatedTable[row][col]);
                }
            }
        }

        return encryptedMessage.toString();
    }

    // Helper method to find the smallest square number >= L
    public static int findSmallestSquareGreaterThanEqualTo(int L) {
        int K = (int) Math.ceil(Math.sqrt(L));  // Ceiling of sqrt(L)
        return K * K;  // Return the square of K
    }
}
