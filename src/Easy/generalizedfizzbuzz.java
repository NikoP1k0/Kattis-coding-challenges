package Easy;

import java.util.Scanner;

public class generalizedfizzbuzz {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt(); int a = myScanner.nextInt(); int b = myScanner.nextInt();
        int FizzBuzzSum = 0; int FizzSum = 0; int BuzzSum = 0;

        for(int i = 1; i <= n; i++){
            if(i % a == 0 && i % b == 0){
                FizzBuzzSum++;
            } else if(i % a == 0 && i % b != 0) {
                FizzSum++;
            } else if(i % a != 0 && i % b == 0) {
                BuzzSum++;
            }
        }

        System.out.println(FizzSum + " " + BuzzSum + " " + FizzBuzzSum);
    }
}
