package Easy.P;

import java.util.Scanner;

public class planina {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();

        // (2^n + 1)^2
        int points = (int) Math.pow((Math.pow(2, n) + 1), 2);
        System.out.println(points);
    }
}
