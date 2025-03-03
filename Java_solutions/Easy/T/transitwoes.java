package Easy.T;

import java.util.Scanner;

public class transitwoes {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int S = myScanner.nextInt();
        int C = myScanner.nextInt();
        int N = myScanner.nextInt();

        // Read walking times
        int[] W = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            W[i] = myScanner.nextInt();
        }

        // Read bus ride times
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = myScanner.nextInt();
        }

        // Read bus intervals
        int[] T = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = myScanner.nextInt();
        }

        // Start journey
        int currentTime = S;

        // Process each transit route
        for (int i = 0; i < N; i++) {
            currentTime += W[i]; // Walk to bus stop

            // Wait for the next available bus
            if (currentTime % T[i] != 0) {
                currentTime = ((currentTime / T[i]) + 1) * T[i];
            }

            currentTime += B[i]; // Ride the bus
        }

        // Walk to class
        currentTime += W[N];

        // Check if Yraglac arrives on time
        if (currentTime <= C) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
