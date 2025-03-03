package Easy.T;

import java.util.Scanner;

public class tarifa {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int X_MegabytesPlan = myScanner.nextInt();
        int months = myScanner.nextInt();
        int savedMegabytes = 0;

        for(int i = 0; i < months; i++){
            int usedSurf = myScanner.nextInt();
            savedMegabytes += X_MegabytesPlan - usedSurf;
        }

        System.out.println(savedMegabytes + X_MegabytesPlan);
    }
}
