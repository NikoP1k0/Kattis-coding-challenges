package Easy.M;

import java.util.Scanner;

public class mixedfractions {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        while(myScanner.hasNext()){
            int numerator = myScanner.nextInt();
            int denominator = myScanner.nextInt();

            if(numerator == 0 && denominator == 0){
                return;
            }

            int wholeNum = numerator / denominator;
            int remainder = numerator % denominator;
            System.out.println(wholeNum + " " + remainder + " / " + denominator);
        }
    }
}
