package Easy.B;

import java.util.Arrays;
import java.util.Scanner;

public class bijele {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int[] piecesSet = new int[6];
        int[] missingPieces = new int[6];

        for(int i = 0; i < 6; i++){
            piecesSet[i] = myScanner.nextInt();
        }

        for(int i = 0; i < 6; i++){
            switch(i){
                case 0:
                    missingPieces[0] = 1 - piecesSet[0];
                case 1:
                    missingPieces[1] = 1 - piecesSet[1];
                case 2:
                    missingPieces[2] = 2 - piecesSet[2];
                case 3:
                    missingPieces[3] = 2 - piecesSet[3];
                case 4:
                    missingPieces[4] = 2 - piecesSet[4];
                case 5:
                    missingPieces[5] = 8 - piecesSet[5];
            }
        }

        Arrays.stream(missingPieces).forEach(e -> System.out.print(e + " "));
    }
}
