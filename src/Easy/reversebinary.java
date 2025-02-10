package Easy;

import java.util.Scanner;

public class reversebinary {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();
        String binaryString = Integer.toBinaryString(number);
        StringBuilder reversedBinary = new StringBuilder(binaryString).reverse();
        System.out.println(Integer.parseInt(String.valueOf(reversedBinary), 2));
    }
}
