package Easy.E;

import java.util.Scanner;

public class easiest {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);


        while (true) {
            int n = myScanner.nextInt();
            if (n == 0) break;

            int originalSum = sumOfDigits(n);
            int m = 11;

            while (true) {
                if (sumOfDigits(n * m) == originalSum) {
                    System.out.println(m);
                    break;
                }
                m++;
            }
        }
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
