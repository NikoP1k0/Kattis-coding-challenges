package Easy.J;

import java.util.Scanner;

public class judgingmoose {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int left = myScanner.nextInt();
        int right = myScanner.nextInt();

        switch (left == right ? left : -1) {
            case 0 -> System.out.println("Not a moose");
            case -1 -> {
                int maxTines = Math.max(left, right);
                System.out.println("Odd " + (2 * maxTines));
            }
            default -> System.out.println("Even " + (left + right));
        }
    }
}
