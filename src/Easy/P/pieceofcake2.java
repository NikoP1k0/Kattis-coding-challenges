package Easy.P;

import java.util.Scanner;

public class pieceofcake2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int sideLength = myScanner.nextInt(); int h = myScanner.nextInt(); int v = myScanner.nextInt();
        int biggestPieceHeight = (h <= sideLength / 2) ? sideLength - h : h;
        int biggestPieceLength = (v <= sideLength / 2) ? sideLength - v : v;
        System.out.println(biggestPieceLength * biggestPieceHeight * 4);
    }
}
