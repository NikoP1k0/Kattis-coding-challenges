package Easy.B;

import java.util.Scanner;

public class biladlyklabord {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String sentence = myScanner.nextLine();
        StringBuilder newSentence = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char currentLetter = sentence.charAt(i);

            if (newSentence.length() == 0 || currentLetter != newSentence.charAt(newSentence.length() - 1)) {
                newSentence.append(currentLetter);
            }
        }
        System.out.println(newSentence);
    }
}
