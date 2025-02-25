package Easy.L;

import java.util.Scanner;

public class laegdyfirlandinu {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int rows = myScanner.nextInt();
        int columns = myScanner.nextInt();
        int[][] forecast = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                forecast[i][j] = myScanner.nextInt();
            }
        }

        for(int i = 1; i < rows - 1; i++){
            for(int j = 1; j < columns - 1; j++){
                int above = forecast[i - 1][j];
                int below = forecast[i + 1][j];
                int left = forecast[i][j - 1];
                int right = forecast[i][j + 1];

                if(forecast[i][j] < above && forecast[i][j] < below && forecast[i][j] < left && forecast[i][j] < right){
                    System.out.println("Jebb");
                    return;
                }
            }
        }

        System.out.println("Neibb");
    }
}
