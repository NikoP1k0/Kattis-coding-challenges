package Easy.F;

import java.util.Scanner;

public class filip {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int digit1 = myScanner.nextInt();
        int digit2 = myScanner.nextInt();
        int reversedDigit1 = ( ((digit1 % 10) * 100) + (digit1 - (digit1 % 10) - ((digit1 / 100) * 100)) + (digit1 / 100));
        int reversedDigit2 = ( ((digit2 % 10) * 100) + (digit2 - (digit2 % 10) - ((digit2 / 100) * 100)) + (digit2 / 100));
        System.out.println(Math.max(reversedDigit1, reversedDigit2));
    }
}
