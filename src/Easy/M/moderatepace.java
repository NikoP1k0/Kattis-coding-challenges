package Easy.M;

import java.util.Arrays;
import java.util.Scanner;

public class moderatepace {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int days = myScanner.nextInt();
        StringBuilder result = new StringBuilder();

        int[][] distances = new int[3][days];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < days; j++){
                distances[i][j] = myScanner.nextInt();
            }
        }

        int[] todaysDistances = new int[3];
        for(int i = 0; i < days; i++){
            todaysDistances[0] = distances[0][i];
            todaysDistances[1] = distances[1][i];
            todaysDistances[2] = distances[2][i];
            Arrays.sort(todaysDistances);
            result.append(todaysDistances[1] + " ");
        }

        System.out.println(result);
    }
}
