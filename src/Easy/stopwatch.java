package Easy;

import java.util.Scanner;

public class stopwatch {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int buttonPresses = myScanner.nextInt();
        int sumSeconds = 0;

        if(buttonPresses % 2 != 0){
            System.out.println("still running");
        } else{
            for(int i = 1; i <= buttonPresses; i++){
                if(i % 2 != 0){
                    sumSeconds += myScanner.nextInt();
                } else{
                    sumSeconds -= myScanner.nextInt();
                }
            }

            System.out.println(sumSeconds * -1);
        }

    }
}
