package Easy;

import java.util.Scanner;

public class umferd {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int m = myScanner.nextInt();
        int n = myScanner.nextInt();
        myScanner.nextLine();
        int nonFilledCells = 0;

        for (int i = 0; i < n; i++) {
            String lane = myScanner.nextLine();
            nonFilledCells += lane.length() - lane.replace(".", "").length();
        }

        double ratio = nonFilledCells / (n * m);
        System.out.println(ratio);
    }
}
