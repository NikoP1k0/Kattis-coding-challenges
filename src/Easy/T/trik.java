package Easy.T;

import java.util.Scanner;

public class trik {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String sequence = myScanner.next();

        int ballPosition = 1;

        for(char move : sequence.toCharArray()){
            switch(move){
                case 'A': // Swap left and middle
                    if (ballPosition == 1) {
                        ballPosition = 2;
                    } else if (ballPosition == 2) {
                        ballPosition = 1;
                    }
                    break;
                case 'B': // Swap middle and right
                    if (ballPosition == 2) {
                        ballPosition = 3;
                    } else if (ballPosition == 3) {
                        ballPosition = 2;
                    }
                    break;
                case 'C': // Swap left and right
                    if (ballPosition == 1) {
                        ballPosition = 3;
                    } else if (ballPosition == 3) {
                        ballPosition = 1;
                    }
                    break;
            }
        }

        System.out.println(ballPosition);
    }
}
