package Easy.S;

import java.util.Scanner;

public class squarepeg {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int length = myScanner.nextInt();
        int radius = myScanner.nextInt();
        double maximumSquareLength = radius * Math.sqrt(2);
        System.out.println(length > maximumSquareLength ? "nope" : "fits");
    }
}
