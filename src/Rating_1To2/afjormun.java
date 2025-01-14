package Rating_1To2;

import java.util.Scanner;

public class afjormun {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int numberOfSentences = 0;
        try{
            numberOfSentences = Integer.parseInt(myScanner.nextLine().trim());
        } catch(NumberFormatException e){
            System.out.println("A number is required");
        }

        for(int i = 0; i < numberOfSentences; i++){
            String sentence = myScanner.nextLine().trim();

            if(sentence.length() > 0){
                String lowercaseSentence = sentence.toLowerCase();
                String capitalisedSentence = Character.toUpperCase(lowercaseSentence.charAt(0)) + lowercaseSentence.substring(1);
                System.out.println(capitalisedSentence);
            }
        }
    }
}
