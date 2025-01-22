package Rating_1To2;

import java.util.Scanner;

public class skak {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int X_rook = myScanner.nextInt();
        int Y_rook = myScanner.nextInt();
        int X_pawn = myScanner.nextInt();
        int Y_pawn = myScanner.nextInt();

        if(X_rook != X_pawn){
            System.out.println((Y_rook != Y_pawn) ? 2 : 1);
        } else{
            System.out.println(1);
        }
    }
}
