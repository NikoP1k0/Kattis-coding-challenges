package Easy.H;

import java.util.HashSet;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();
        String permutation = myScanner.nextLine();

        HashSet<Character> uniqueChars = new HashSet<>();
        for(int i = 0; i < word.length(); i++){
            uniqueChars.add(word.charAt(i));
        }

        int wrongGuesses = 0;
        int correctGuesses = 0;
        for(int i = 0; i < permutation.length(); i++){
            if(!uniqueChars.contains(permutation.charAt(i))){
                wrongGuesses++;
            } else{
                correctGuesses++;
            }

            if(correctGuesses == uniqueChars.size()){
                System.out.println("WIN");
                return;
            }

            if(wrongGuesses == 10){
                System.out.println("LOSE");
                return;
            }
        }
    }
}
