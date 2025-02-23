package Easy.G;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number1 = myScanner.nextInt();
        int number2 = myScanner.nextInt();
        System.out.println(gcd(number1, number2));
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
