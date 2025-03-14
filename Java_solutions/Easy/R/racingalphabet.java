package Easy.R;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class racingalphabet {
    static final int NUM_POINTS = 28;
    static final double DIAMETER = 60.0;
    static final double SPEED = 15.0;
    static final double PICKUP_TIME = 1.0;

    static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '";
    static final double CIRCUMFERENCE = Math.PI * DIAMETER;
    static final double ARC_LENGTH = CIRCUMFERENCE / NUM_POINTS;

    static Map<Character, Integer> charToIndex = new HashMap<>();

    static {
        for (int i = 0; i < ALPHABET.length(); i++) {
            charToIndex.put(ALPHABET.charAt(i), i);
        }
    }

    public static double computeTime(String aphorism) {
        int[] positions = new int[aphorism.length()];
        for (int i = 0; i < aphorism.length(); i++) {
            positions[i] = charToIndex.get(aphorism.charAt(i));
        }

        double totalTime = PICKUP_TIME;  // First pickup

        for (int i = 1; i < positions.length; i++) {
            int prev = positions[i - 1];
            int curr = positions[i];

            int steps = Math.min(Math.abs(curr - prev), NUM_POINTS - Math.abs(curr - prev));
            double distance = steps * ARC_LENGTH;
            totalTime += (distance / SPEED) + PICKUP_TIME;
        }

        return totalTime;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = Integer.parseInt(myScanner.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String aphorism = myScanner.nextLine().trim();
            System.out.printf("%.10f%n", computeTime(aphorism));
        }
    }
}
