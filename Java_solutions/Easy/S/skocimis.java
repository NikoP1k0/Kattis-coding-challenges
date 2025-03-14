package Easy.S;

import java.util.Scanner;

public class skocimis {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int A = myScanner.nextInt();
        int B = myScanner.nextInt();
        int C = myScanner.nextInt();
        System.out.println(Math.max(B - A, C - B) - 1);
    }
}
