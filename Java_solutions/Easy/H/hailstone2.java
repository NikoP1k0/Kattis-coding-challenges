package Easy.H;

import java.util.Scanner;

public class hailstone2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        long n = myScanner.nextLong();

        int count = 1;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            count++;
        }

        System.out.println(count);
    }
}
