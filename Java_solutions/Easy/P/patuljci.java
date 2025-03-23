package Easy.P;

import java.util.Scanner;

public class patuljci {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] dwarves = new int[9];
        int totalSum = 0;

        for (int i = 0; i < 9; i++) {
            dwarves[i] = myScanner.nextInt();
            totalSum += dwarves[i];
        }

        // Find the two imposters
        int excess = totalSum - 100;
        int fake1 = -1, fake2 = -1;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (dwarves[i] + dwarves[j] == excess) {
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
            if (fake1 != -1) break;
        }

        for (int i = 0; i < 9; i++) {
            if (i != fake1 && i != fake2) {
                System.out.println(dwarves[i]);
            }
        }
    }
}
