package Easy.L;

import java.util.Scanner;

public class laptopsticker {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int wc = myScanner.nextInt(); int hc = myScanner.nextInt();
        int ws = myScanner.nextInt(); int hs = myScanner.nextInt();
        System.out.println((ws <= wc - 2 && hs <= hc - 2) ? 1 : 0);
    }
}
