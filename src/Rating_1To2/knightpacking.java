package Rating_1To2;

import java.util.Scanner;

public class knightpacking {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int N = myScanner.nextInt();
        int totalSquares = N * N;

        System.out.println((totalSquares % 2 == 1) ? "first" : "second");
    }
}
