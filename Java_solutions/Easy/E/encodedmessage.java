package Easy.E;

import java.util.Scanner;

public class encodedmessage {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        myScanner.nextLine();

        for (int t = 0; t < testCases; t++) {
            String encodedMessage = myScanner.nextLine();
            int length = encodedMessage.length();
            int N = (int) Math.sqrt(length);
            char[][] grid = new char[N][N];

            int index = 0;
            for (int col = 0; col < N; col++) {
                for (int row = N - 1; row >= 0; row--) { // Fill from bottom to top
                    grid[row][col] = encodedMessage.charAt(index++);
                }
            }

            StringBuilder decodedMessage = new StringBuilder();
            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {
                    decodedMessage.append(grid[row][col]);
                }
            }

            System.out.println(decodedMessage);
        }

    }
}
