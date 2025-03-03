package Easy.F;

import java.util.Scanner;

public class fallingsnow2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int N = myScanner.nextInt();
        int M = myScanner.nextInt();
        String[][] snowArray = new String[N][M];


        // Fetch board
        for(int i = 0; i < N; i++){
            String line = myScanner.next();
            for(int j = 0; j < M; j++){
                snowArray[i][j] = String.valueOf(line.charAt(j));
            }
        }

        String[][] resultArray = new String[N][M];

        for (int j = 0; j < M; j++) {
            int snowflakesCount = 0;

            // Count the number of snowflakes "S" in this column
            for (int i = 0; i < N; i++) {
                if (snowArray[i][j].equals("S")) {
                    snowflakesCount++;
                }
            }

            // Place snowflakes at the bottom of the column in resultArray
            for (int i = N - 1; i >= N - snowflakesCount; i--) {
                resultArray[i][j] = "S";
            }

            // Fill remaining positions in the column with "."
            for (int i = 0; i < N - snowflakesCount; i++) {
                resultArray[i][j] = ".";
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(resultArray[i][j]);
            }
            System.out.println();
        }
    }
}
