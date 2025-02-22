package Easy.B;

import java.util.Scanner;

public class bela {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int hands = myScanner.nextInt();
        char dominantSuit = myScanner.next().charAt(0);
        myScanner.nextLine();

        int totalPoints = 0;
        for(int i = 0; i < hands * 4; i++){
            String currentCard = myScanner.nextLine();
            char currentNumber = currentCard.charAt(0);
            char currentSuit = currentCard.charAt(1);

            switch (currentNumber) {
                case 'A' -> totalPoints += 11;
                case 'K' -> totalPoints += 4;
                case 'Q' -> totalPoints += 3;
                case 'J' -> {
                    if (currentSuit == dominantSuit) {
                        totalPoints += 20;
                    } else {
                        totalPoints += 2;
                    }
                }
                case 'T' -> totalPoints += 10;
                case '9' -> {
                    if (currentSuit == dominantSuit) {
                        totalPoints += 14;
                    }
                }
            }
        }

        System.out.println(totalPoints);
    }
}
