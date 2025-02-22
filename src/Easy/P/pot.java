package Easy.P;

import java.util.Scanner;

public class pot {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int numberOfIntegers = myScanner.nextInt();
        int sum = 0;

        for(int i = 0; i < numberOfIntegers; i++){
            int number = myScanner.nextInt();
            sum += Math.pow(number / 10, number % 10);
        }

        System.out.println(sum);
    }
}
