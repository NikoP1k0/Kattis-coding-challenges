package Easy.B;

import java.util.Scanner;

public class batterup {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int atBats = myScanner.nextInt();

        int numerator = 0;
        int denominator = 0;
        for(int i = 0; i < atBats; i++){
            int currentAtBat = myScanner.nextInt();
            if(currentAtBat >= 0){
                numerator += currentAtBat;
                denominator++;
            }
        }

        System.out.println((double) numerator / denominator);
    }
}
