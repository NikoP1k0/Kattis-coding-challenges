package Easy;

import java.util.Objects;
import java.util.Scanner;

public class minesweeper {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int m = myScanner.nextInt();
        int k = myScanner.nextInt();

        String[][] grid = new String[n][m];

        for(int i = 0; i < k; i++){
            int row = myScanner.nextInt();
            int column = myScanner.nextInt();

            grid[row - 1][column - 1] = "*";
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(!Objects.equals(grid[i][j], "*")){
                    grid[i][j] = ".";
                }
            }
        }

        for (String[] row : grid) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
