package Easy.T;

import java.util.Scanner;

public class tornbygge {
    public static void main(String[] args){
        Scanner myScanner  = new Scanner(System.in);
        int n = myScanner.nextInt();

        int towerCount = 0;
        int temp =  -1;
        for(int i = 0; i < n; i++){
            int currentBrick = myScanner.nextInt();

            if(currentBrick > temp){
                towerCount++;
            }
            temp = currentBrick;
        }

        System.out.println(towerCount);
    }
}
