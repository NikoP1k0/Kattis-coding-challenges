package Easy.H;

import java.util.Scanner;

public class humancannonball2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            double V0 = myScanner.nextDouble();
            double angle = myScanner.nextDouble();
            double x1 = myScanner.nextDouble();
            double h1 = myScanner.nextDouble();
            double h2 = myScanner.nextDouble();

            if (calculateLaunch(V0, angle, x1, h1, h2)) {
                System.out.println("Safe");
            } else {
                System.out.println("Not Safe");
            }
        }
    }

    public static boolean calculateLaunch(double velocity, double angle, double x1, double h1, double h2) {
        final double g = 9.81;  // Gravity constant

        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate the time at which the cannonball reaches x = x1
        double t = x1 / (velocity * Math.cos(radians));

        // Calculate the y-position at this time
        double y = velocity * t * Math.sin(radians) - (0.5 * g * t * t);

        // Check if it safely passes through the hole
        return (y >= h1 + 1) && (y <= h2 - 1);
    }
}
