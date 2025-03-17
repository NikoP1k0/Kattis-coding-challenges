package Easy.T;

import java.util.Scanner;

public class theplank {
    public static void main(String[] args){
        Scanner myScanner  = new Scanner(System.in);
        int n = myScanner.nextInt();

        if(n == 0){
            System.out.println(1);
            return;
        }

        if (n == 1) {
            System.out.println(1);
            return;
        }

        if (n == 2) {
            System.out.println(2);
            return;
        }

        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        // Fill the DP table
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        System.out.println(dp[n]);
    }
}
