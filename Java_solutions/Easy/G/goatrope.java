package Easy.G;

import java.util.Scanner;

public class goatrope {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int x0 = myScanner.nextInt(); int y0 = myScanner.nextInt();
        int x1 = myScanner.nextInt(); int y1 = myScanner.nextInt();
        int x2 = myScanner.nextInt(); int y2 = myScanner.nextInt();

        // Determine the actual bounding box (min and max for x and y)
        int xmin = Math.min(x1, x2), xmax = Math.max(x1, x2);
        int ymin = Math.min(y1, y2), ymax = Math.max(y1, y2);

        // Find the closest point on the rectangle
        int xc = Math.max(xmin, Math.min(x0, xmax));
        int yc = Math.max(ymin, Math.min(y0, ymax));

        // Compute Euclidean distance
        double distance = Math.sqrt(Math.pow(x0 - xc, 2) + Math.pow(y0 - yc, 2));
        System.out.printf("%.6f%n", distance);
    }
}
