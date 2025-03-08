package Easy.D;

import java.util.Scanner;

public class drmmessages {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String drmMessage = myScanner.nextLine();

        int length = drmMessage.length();
        int half = length / 2;

        // Split into two halves
        String left = drmMessage.substring(0, half);
        String right = drmMessage.substring(half);

        // Compute rotation values
        int leftRotation = computeRotationValue(left);
        int rightRotation = computeRotationValue(right);

        // Rotate each half
        String rotatedLeft = rotateString(left, leftRotation);
        String rotatedRight = rotateString(right, rightRotation);

        // Merge the two halves
        String decryptedMessage = merge(rotatedLeft, rotatedRight);

        // Print the final output
        System.out.println(decryptedMessage);
    }

    // Compute the rotation value of a string
    private static int computeRotationValue(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += (c - 'A');
        }
        return sum;
    }

    // Rotate a string by a given value
    private static String rotateString(String str, int rotation) {
        StringBuilder rotated = new StringBuilder();
        for (char c : str.toCharArray()) {
            char newChar = (char) ('A' + (c - 'A' + rotation) % 26);
            rotated.append(newChar);
        }
        return rotated.toString();
    }

    // Merge two strings using character-based shifting
    private static String merge(String left, String right) {
        StringBuilder merged = new StringBuilder();
        for (int i = 0; i < left.length(); i++) {
            int shift = right.charAt(i) - 'A'; // Shift value from right string
            char newChar = (char) ('A' + (left.charAt(i) - 'A' + shift) % 26);
            merged.append(newChar);
        }
        return merged.toString();
    }
}
