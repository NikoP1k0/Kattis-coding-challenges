package Easy.K;

import java.util.Arrays;
import java.util.Scanner;

public class kornislav {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int[] steps = new int[4];
        for (int i = 0; i < 4; i++) {
            steps[i] = myScanner.nextInt();
        }

        Arrays.sort(steps);
        int maxArea = steps[0] * steps[2];
        System.out.println(maxArea);
    }
}
