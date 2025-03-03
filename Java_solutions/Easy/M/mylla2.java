package Easy.M;

import java.util.Scanner;

public class mylla2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char[][] grid = new char[3][3];

        for(int i = 0; i < 3; i++){
            String row = myScanner.nextLine();
            for(int j = 0; j < 3; j++){
                grid[i][j] = row.charAt(j);
            }
        }

        if (hasHjaltiWon(grid)) {
            System.out.println("Jebb");
        } else {
            System.out.println("Neibb");
        }
    }

    public static boolean hasHjaltiWon(char[][] board) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O') {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||
                (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')) {
            return true;
        }

        return false;
    }
}
