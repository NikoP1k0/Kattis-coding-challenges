package Easy.B;

import java.util.Scanner;

public class bus {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int t = myScanner.nextInt();

        for(int i = 0; i < t; i++){
            int n = myScanner.nextInt();
            System.out.println((int) Math.pow(2,n) - 1);
        }
    }
}
