package Easy.S;

import java.util.Scanner;

public class sorttwonumbers {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int number1 = myScanner.nextInt(); int number2 = myScanner.nextInt();
        System.out.println((number1 > number2 ? number2 + " " + number1 : number1 + " " + number2));
    }
}
