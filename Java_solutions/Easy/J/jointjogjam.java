package Easy.J;

import java.util.Scanner;

public class jointjogjam {
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int x1 = myScanner.nextInt();
        int y1 = myScanner.nextInt();
        int x2 = myScanner.nextInt();
        int y2 = myScanner.nextInt();
        int x3 = myScanner.nextInt();
        int y3 = myScanner.nextInt();
        int x4 = myScanner.nextInt();
        int y4 = myScanner.nextInt();

        int steps = 1000;
        double maxDistance = 0;

        for (int i = 0; i <= steps; i++) {
            double t = i / (double) steps;

            // Kari's position at time t
            double kx = x1 + t * (x3 - x1);
            double ky = y1 + t * (y3 - y1);

            // Ola's position at time t
            double ox = x2 + t * (x4 - x2);
            double oy = y2 + t * (y4 - y2);

            // Calculate the distance between Kari and Ola at time t
            double dist = distance(kx, ky, ox, oy);

            // Track the maximum distance
            if (dist > maxDistance) {
                maxDistance = dist;
            }
        }

        System.out.printf("%.10f\n", maxDistance);
    }
}
