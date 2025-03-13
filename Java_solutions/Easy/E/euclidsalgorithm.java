package Easy.E;

import java.util.Scanner;

public class euclidsalgorithm {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        long a = myScanner.nextLong();
        long b = myScanner.nextLong();
        System.out.println(gcd(a, b));
    }

    public static long gcd(long a, long b){
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
