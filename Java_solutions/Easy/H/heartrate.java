package Easy.H;

import java.util.Scanner;

public class heartrate {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();

        for(int i = 0; i < testCases; i++){
            int b = myScanner.nextInt();
            double p = myScanner.nextDouble();
            double minABPM = (60 * (b - 1)) / p;
            double BPM = (60 * b) / p;
            double maxABPM = (60 * (b + 1)) / p;
            System.out.printf("%.4f %.4f %.4f%n", minABPM, BPM, maxABPM);
        }
    }
}
