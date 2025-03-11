package Easy.H;

import java.util.Scanner;

public class hitastig {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();

        long maxTemp = Long.MIN_VALUE;
        long minTemp = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            long temp = myScanner.nextLong();
            maxTemp = Math.max(maxTemp, temp);
            minTemp = Math.min(minTemp, temp);
        }

        System.out.println(maxTemp + " " + minTemp);
        myScanner.close();
    }
}
