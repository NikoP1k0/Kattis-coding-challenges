package Easy.C;

import java.util.Scanner;

public class cornhusker {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i < 5; i++){
            int k1 = myScanner.nextInt();
            int k2 = myScanner.nextInt();
            sum += k1 * k2;
        }

        int kAvg = sum / 5;
        int N = myScanner.nextInt();
        int KWF = myScanner.nextInt();

        System.out.println((N * kAvg) / KWF);
    }
}
