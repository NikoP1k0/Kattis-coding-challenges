package Easy.F;

import java.util.Scanner;

public class freefood {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        boolean[] days = new boolean[366];

        for (int i = 0; i < n; i++) {
            int s = myScanner.nextInt(); // Start day
            int e = myScanner.nextInt(); // End day

            // Mark all days from s to e as having food
            for (int day = s; day <= e; day++) {
                days[day] = true;
            }
        }

        // Count the number of days where food is served
        int count = 0;
        for (int i = 1; i <= 365; i++) {
            if (days[i]) count++;
        }

        System.out.println(count);
    }
}
