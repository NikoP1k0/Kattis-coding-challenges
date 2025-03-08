package Easy.C;

import java.util.Scanner;

public class countingclauses {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int c = myScanner.nextInt();  // Number of clauses
        int v = myScanner.nextInt();  // Number of variables (not used)

        if (c >= 8) {
            System.out.println("satisfactory");
        } else {
            System.out.println("unsatisfactory");
        }
    }
}