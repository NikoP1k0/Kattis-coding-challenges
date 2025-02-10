package Easy;

import java.util.Scanner;

public class forcedchoice {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfCards = myScanner.nextInt(); // Not used
        int secretPrediction = myScanner.nextInt();
        int steps = myScanner.nextInt();

        for(int i = 0; i < steps; i++){
            int m = myScanner.nextInt();
            boolean predictionCardFound = false;

            for(int y = 0; y < m; y++){
                int currentCard = myScanner.nextInt();
                if(currentCard == secretPrediction){
                    System.out.println("KEEP");
                    predictionCardFound = true;
                }
            }

            if(!predictionCardFound){
                System.out.println("REMOVE");
            }
        }

    }
}
