package Easy.C;

import java.util.Scanner;

public class cetvrta {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int[][] points = new int[3][2];
        for(int i = 0; i < 3; i++){
            points[i][0] = myScanner.nextInt();
            points[i][1] = myScanner.nextInt();
        }

        // XOR operation to find the missing x- and y-coordinate
        int x,y;
        x = points[0][0] ^ points[1][0] ^ points[2][0];
        y = points[0][1] ^ points[1][1] ^ points[2][1];

        System.out.println(x + " " + y);
    }
}
