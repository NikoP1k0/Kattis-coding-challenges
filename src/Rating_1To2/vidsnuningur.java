package Rating_1To2;

import java.util.Scanner;

public class vidsnuningur {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String text = myScanner.nextLine();
        System.out.println(new StringBuilder(text).reverse());
    }
}
