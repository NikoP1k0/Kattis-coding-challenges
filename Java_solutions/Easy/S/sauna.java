package Easy.S;

import java.util.Scanner;

public class sauna {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Number of people
        int maxL = Integer.MIN_VALUE; // Start with the smallest possible value
        int minR = Integer.MAX_VALUE; // Start with the largest possible value

        for (int i = 0; i < n; i++) {
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            maxL = Math.max(maxL, L); // Keep track of highest minimum
            minR = Math.min(minR, R); // Keep track of lowest maximum
        }

        if (maxL > minR) {
            System.out.println("bad news");
        } else {
            System.out.println((minR - maxL + 1) + " " + maxL);
        }

    }
}
