package Easy.H;

import java.util.Scanner;

public class heirsdilemma {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int L = myScanner.nextInt();
        int H = myScanner.nextInt();
        int validCombSum = 0;

        for (int i = L; i <= H; i++) {
            String numStr = String.valueOf(i);
            if (hasUniqueDigits(numStr) && allDigitsAreNonZero(numStr) && allDigitsDivide(numStr, i)) {
                validCombSum++;
            }
        }

        System.out.println(validCombSum);
    }

    public static boolean hasUniqueDigits(String numStr) {
        boolean[] seen = new boolean[10]; // Digits 0-9
        for (char ch : numStr.toCharArray()) {
            int digit = ch - '0';
            if (seen[digit]) return false; // Found duplicate
            seen[digit] = true;
        }
        return true;
    }

    public static boolean allDigitsAreNonZero(String numStr) {
        return !numStr.contains("0");
    }

    public static boolean allDigitsDivide(String numStr, int num) {
        for (char ch : numStr.toCharArray()) {
            int digit = ch - '0';
            if (num % digit != 0) return false; // Not evenly divisible
        }
        return true;
    }
}
