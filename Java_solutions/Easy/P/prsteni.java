package Easy.P;

import java.util.Scanner;

public class prsteni {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int rings = myScanner.nextInt();

        int[] ringRadii = new int[rings];
        for(int i = 0; i < rings; i++){
            ringRadii[i] = myScanner.nextInt();
        }

        int firstRingRadius = ringRadii[0];

        // Compute the fraction for each subsequent ring
        for (int i = 1; i < rings; i++) {
            int gcdValue = gcd(firstRingRadius, ringRadii[i]);
            System.out.println((firstRingRadius / gcdValue) + "/" + (ringRadii[i] / gcdValue));
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
