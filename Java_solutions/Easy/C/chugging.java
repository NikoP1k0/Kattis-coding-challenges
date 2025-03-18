package Easy.C;

import java.util.Scanner;

public class chugging {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int numBottles = myScanner.nextInt();
        int tA = myScanner.nextInt(); int dA = myScanner.nextInt();
        int tB = myScanner.nextInt(); int dB = myScanner.nextInt();

        int aliceTotalTime = 0;
        int bobTotalTime = 0;
        for(int i = 0; i < numBottles; i++){
            aliceTotalTime += tA + (i * dA);
            bobTotalTime += tB + (i * dB);
        }

        if(aliceTotalTime != bobTotalTime){
            System.out.println(aliceTotalTime < bobTotalTime ? "Alice" : "Bob");
        } else{
            System.out.println("=");
        }
    }
}
