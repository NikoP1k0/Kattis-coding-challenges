package Rating_1To2;

import java.util.Scanner;

public class hakkari {
    public static void main(String[] main){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int m = myScanner.nextInt();
        myScanner.nextLine(); // Clear

        String[][] board = new String[n][m];
        int mines = 0;
        StringBuilder coordinates = new StringBuilder();

        // Reading the grid
        for(int i = 0; i < n; i++){
            String line = myScanner.nextLine();
            for(int j = 0; j < m; j++){
                board[i][j] = String.valueOf(line.charAt(j));
            }
        }

        // Counting mines
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j].equals("*")){
                    mines++;
                    String X_and_Y = (i + 1) + " " + (j + 1);
                    coordinates.append(X_and_Y).append("\n");
                }
            }
        }

        System.out.println(mines);
        System.out.println(coordinates);
    }
}
