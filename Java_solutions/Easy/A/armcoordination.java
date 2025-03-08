package Easy.A;

import java.util.Scanner;

public class armcoordination {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int x = myScanner.nextInt();
        int y = myScanner.nextInt();
        int r = myScanner.nextInt();

        // Compute the rotated square corners
        int x1 = x - r, y1 = y - r;
        int x2 = x - r, y2 = y + r;
        int x3 = x + r, y3 = y + r;
        int x4 = x + r, y4 = y - r;

        // Print in counterclockwise order (matching expected output)
        System.out.println(x1 + " " + y1);
        System.out.println(x2 + " " + y2);
        System.out.println(x3 + " " + y3);
        System.out.println(x4 + " " + y4);
    }
}
