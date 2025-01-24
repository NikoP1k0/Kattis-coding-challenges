package Rating_1To2;

import java.util.Scanner;

public class digitswap {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String digit = myScanner.nextLine();
        System.out.println("" + digit.charAt(1) + digit.charAt(0));
    }
}
