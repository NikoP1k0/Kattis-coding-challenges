package Easy.P;

import java.util.Scanner;

public class parking2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            int numStores = myScanner.nextInt();
            int minPos = Integer.MAX_VALUE;
            int maxPos = Integer.MIN_VALUE;

            for (int i = 0; i < numStores; i++) {
                int store = myScanner.nextInt();
                minPos = Math.min(minPos, store);
                maxPos = Math.max(maxPos, store);
            }

            int minDistance = 2 * (maxPos - minPos);
            System.out.println(minDistance);
        }
    }
}
