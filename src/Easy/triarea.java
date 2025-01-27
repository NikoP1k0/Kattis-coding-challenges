package Easy;

import java.util.Scanner;

public class triarea {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        double height = myScanner.nextInt();
        double base = myScanner.nextInt();
        System.out.println((height * base) / 2);
    }
}
