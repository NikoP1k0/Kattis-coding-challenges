package Easy.R;

import java.util.Scanner;

public class railroad2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int level = myScanner.nextInt();
        int switches = myScanner.nextInt();

        // Check if the number of switch-junctions are even
        if (switches % 2 == 0) {
            System.out.println("possible");
        } else {
            System.out.println("impossible");
        }
    }
}
