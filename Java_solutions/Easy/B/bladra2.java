package Easy.B;

import java.util.Scanner;

public class bladra2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        double v = myScanner.nextInt(); double a = myScanner.nextInt(); double t = myScanner.nextInt();
        System.out.println((v*t) + (0.5 * a * Math.pow(t, 2)));
    }
}
