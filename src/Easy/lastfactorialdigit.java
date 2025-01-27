package Easy;

import java.util.Scanner;

public class lastfactorialdigit {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();

        for(int i = 0; i < testCases; i++){
            System.out.println(LastFactorial(myScanner.nextInt()));
        }
    }

    public static int LastFactorial(int n){
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = (fact * i) % 10;
        }
        return fact;
    }
}
