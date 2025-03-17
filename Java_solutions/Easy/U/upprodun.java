package Easy.U;

import java.util.Scanner;

public class upprodun {
    public static void main(String[] args){
        Scanner myScanner  = new Scanner(System.in);
        int n = myScanner.nextInt();
        int m = myScanner.nextInt();

        int base = m / n;
        int extra = m % n;

        for(int i = 0; i < n; i++){
            int size = base + (i < extra ? 1 : 0);
            System.out.println("*".repeat(size));
        }
    }
}
