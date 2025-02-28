package Easy.R;

import java.util.Scanner;

public class rectanglearea {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double x1 = myScanner.nextDouble();
        double y1 = myScanner.nextDouble();
        double x2 = myScanner.nextDouble();
        double y2 = myScanner.nextDouble();

        double length = Math.abs(x2 - x1);
        double width = Math.abs(y2 - y1);

        System.out.printf("%.3f%n", length * width);
    }
}
