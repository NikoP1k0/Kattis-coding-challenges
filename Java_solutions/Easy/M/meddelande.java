package Easy.M;

import java.util.Scanner;

public class meddelande {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int rows = myScanner.nextInt(); int columns = myScanner.nextInt();
        String[][] grid = new String[rows][columns];
        myScanner.nextLine(); // Clear Line

        // Store the grid
        for(int i = 0; i < grid.length; i++){
            String line = myScanner.nextLine();
            for(int j = 0; j < grid[i].length; j++){
                grid[i][j] = String.valueOf(line.charAt(j));
            }
        }

        StringBuilder hiddenMessage = new StringBuilder();
        for (String[] strings : grid) {
            for (String cell : strings) {
                if (!cell.equals(".")) {
                    hiddenMessage.append(cell);
                }
            }
        }

        System.out.println(hiddenMessage);
    }
}
