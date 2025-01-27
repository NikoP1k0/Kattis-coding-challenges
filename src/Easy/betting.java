package Easy;

import java.util.Scanner;

public class betting {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double percentageOfOption1 = myScanner.nextDouble();
        System.out.println(1 + (((100 - percentageOfOption1) * 50 * 0.01)/ (percentageOfOption1 * 0.01 * 50)) ); // Option 1 wins
        System.out.println(1 + ((percentageOfOption1 * 0.01 * 50) / ((100 - percentageOfOption1) * 50 * 0.01)) ); // Option 2 wins
    }
}
