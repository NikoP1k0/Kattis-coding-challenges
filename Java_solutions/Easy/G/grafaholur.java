package Easy.G;

import java.util.Scanner;

public class grafaholur {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt(); // Number of workers that dig their own hole
        int h = myScanner.nextInt(); // Time it takes them
        int x = myScanner.nextInt(); // Cubic metres each of the dig

        int m = myScanner.nextInt(); // Number of workers working on the same hole
        int y = myScanner.nextInt(); // Cubic metres they dig out of the same hole

        // Time = (y * h * n) / (m * x)
        double time = (double)(y * h * n) / (m * x);
        System.out.println(time);
    }
}
