package Easy;

import java.util.Scanner;

public class shatteredcake {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int widthOfTheCake = myScanner.nextInt();
        int numberOfCakePieces = myScanner.nextInt();

        int cakeArea = 0;
        for(int i = 0; i < numberOfCakePieces; i++){
            int width = myScanner.nextInt();
            int length = myScanner.nextInt();
            cakeArea += width * length;
        }

        System.out.println(cakeArea / widthOfTheCake);
    }
}
