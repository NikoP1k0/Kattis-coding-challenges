package Easy.S;

import java.util.Scanner;

public class skammstofun {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfWords = myScanner.nextInt();
        myScanner.nextLine(); // Clear Line

        StringBuilder abbreviation = new StringBuilder();
        for(int i = 0; i < numberOfWords; i++){
            String word = myScanner.next();
            char firstLetter = word.charAt(0);
            if(Character.isUpperCase(firstLetter)){
                abbreviation.append(firstLetter);
            }
        }

        System.out.println(abbreviation);
    }
}
