package Easy.O;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ooohisee {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int rows = myScanner.nextInt(); int columns = myScanner.nextInt();
        myScanner.nextLine(); // Clear Line
        String[][] treasureMap = new String[rows][columns];

        for(int i = 0; i < treasureMap.length; i++){
            String line = myScanner.nextLine();
            for(int y = 0; y < treasureMap[i].length; y++){
                treasureMap[i][y] = String.valueOf(line.charAt(y));
            }
        }

        List<int[]> surroundedZeros = new ArrayList<>();

        int[][] directions = {
                {-1, -1},{-1, 0},{-1, 1}, // Top left, Top, Top right
                {0, -1} ,         {0, 1}, // Left, Right
                {1, -1} ,{1, 0} , {1, 1}, // Bottom left, Bottom, Bottom right
        };

        for(int i = 1; i < rows - 1; i++){
            for(int j = 1; j < columns - 1; j++){
                if(treasureMap[i][j].equals("0")){
                    boolean isSurrounded = true;

                    for(int[] dir : directions){
                        int ni = i + dir[0];
                        int nj = j + dir[1];

                        if(!treasureMap[ni][nj].equals("O")){
                            isSurrounded = false;
                            break;
                        }
                    }

                    if(isSurrounded){
                        surroundedZeros.add(new int[]{i + 1, j + 1});
                    }
                }
            }
        }

        if (surroundedZeros.size() == 1) {
            int[] pos = surroundedZeros.get(0);
            System.out.println(pos[0] + " " + pos[1]);
        } else if (surroundedZeros.size() > 1) {
            System.out.println("Oh no! " + surroundedZeros.size() + " locations");
        } else {
            System.out.println("Oh no!");
        }
    }
}
