package Rating_1To2;

import java.util.Scanner;

public class addingtrouble {

    public static void main(String[] args){
        Scanner MyScanner = new Scanner(System.in);
        int A = MyScanner.nextInt(); int B = MyScanner.nextInt(); int C = MyScanner.nextInt();

        if(A + B == C){
            System.out.println("correct!");
        } else {
            System.out.println("wrong!");
        }

    }
}
