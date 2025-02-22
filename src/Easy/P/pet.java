package Easy.P;

import java.util.Scanner;

public class pet {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int[] SummedPoints = new int[5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                SummedPoints[i] += myScanner.nextInt();
            }
        }

        int MaxIndex = 0;
        int MaxPoints = SummedPoints[0];

        for(int i = 1; i < SummedPoints.length; i++){
            if(SummedPoints[i] > MaxPoints){
                MaxPoints = SummedPoints[i];
                MaxIndex = i;
            }
        }

        System.out.println((MaxIndex + 1) + " " + MaxPoints);
    }
}
