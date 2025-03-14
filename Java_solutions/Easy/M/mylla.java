package Easy.M;

import java.util.Scanner;

public class mylla {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int rounds = myScanner.nextInt();
        myScanner.nextLine();
        String wins = myScanner.nextLine();

        int HannesWins = 0;
        int ArnarWins = 0;
        int roundsWon_H = 0;
        int roundsWon_A = 0;
        for(int i = 0; i < wins.length(); i++){
            if(wins.charAt(i) == 'H'){
                roundsWon_H++;
            } else{
                roundsWon_A++;
            }

            if(roundsWon_H == 3){
                HannesWins++;
                roundsWon_A = 0;
                roundsWon_H = 0;
            }

            if(roundsWon_A == 3) {
                ArnarWins++;
                roundsWon_A = 0;
                roundsWon_H = 0;
            }
        }

        if(HannesWins == rounds){
            System.out.println("Arnar");
        } else if(ArnarWins == rounds) {
            System.out.println("Hannes");
        }
    }
}
