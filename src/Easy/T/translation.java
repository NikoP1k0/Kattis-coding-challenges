package Easy.T;

import java.util.HashMap;
import java.util.Scanner;

public class translation {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfWordsInSentence = myScanner.nextInt();
        String[] swedishSentence = new String[numberOfWordsInSentence];
        myScanner.nextLine(); // Clear line

        for(int i = 0; i < numberOfWordsInSentence; i++){
            swedishSentence[i] = myScanner.next();
        }

        int numberOfDictionaryWords = myScanner.nextInt();
        HashMap<String, String> dictionary = new HashMap<>();
        myScanner.nextLine(); // Clear line
        for(int i = 0; i < numberOfDictionaryWords; i++){
            String swedishWord = myScanner.next();
            String englishTranslation = myScanner.next();
            dictionary.put(swedishWord, englishTranslation);
        }

        StringBuilder translatedSentence = new StringBuilder();
        for(int i = 0; i < numberOfWordsInSentence; i++){
            if(dictionary.containsKey(swedishSentence[i])){
                translatedSentence.append(dictionary.get(swedishSentence[i]) + " ");
            }
        }

        System.out.println(translatedSentence);
    }
}
