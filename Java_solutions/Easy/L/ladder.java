package Easy.L;

import java.util.Scanner;

public class ladder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int h = myScanner.nextInt(); int v = myScanner.nextInt();

        // Convert v to radians since Java's Math.sin() uses radians
        double angleInRadians = Math.toRadians(v);
        double ladderLength = h / Math.sin(angleInRadians);
        int result = (int) Math.ceil(ladderLength);
        System.out.println(result);
    }
}
