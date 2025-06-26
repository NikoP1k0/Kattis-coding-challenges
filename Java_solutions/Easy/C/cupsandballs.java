package Easy.C;

import java.util.Scanner;

public class cupsandballs {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int HugosGuess = myScanner.nextInt();
        int swaps = myScanner.nextInt();
        int ball = 2;

        // Swap the ball's position
        for (int i = 0; i < swaps; i++) {
            int a = myScanner.nextInt();
            int b = myScanner.nextInt();
            if (ball == a) {
                ball = b;
            } else if (ball == b) {
                ball = a;
            }
        }

        // Try all possible different swaps to help Hugo
        int[][] candidates = {{1, 2}, {1, 3}, {2, 3}};

        for (int[] swap : candidates) {
            int a = swap[0];
            int b = swap[1];
            int newBall = ball;

            // Simulate this extra swap
            if (newBall == a) {
                newBall = b;
            } else if (newBall == b) {
                newBall = a;
            }

            if (newBall == HugosGuess) {
                System.out.println(a + " " + b);
                return;
            }
        }
    }
}
