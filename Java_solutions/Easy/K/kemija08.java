package Easy.K;

import java.util.Scanner;

public class kemija08 {
    public static String decodeWord(String word) {
        StringBuilder decodedWord = new StringBuilder();
        int i = 0;

        while (i < word.length()) {
            char currentChar = word.charAt(i);
            if ("aeiou".indexOf(currentChar) != -1 && i + 2 < word.length()) {
                if (word.charAt(i + 1) == 'p' && word.charAt(i + 2) == currentChar) {
                    decodedWord.append(currentChar);
                    i += 3;
                } else {
                    decodedWord.append(currentChar);
                    i++;
                }
            } else {
                decodedWord.append(currentChar);
                i++;
            }
        }

        return decodedWord.toString();
    }


    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String encodedSentence = myScanner.nextLine();
        String[] words = encodedSentence.split(" ");

        // Decode each word
        StringBuilder decodedSentence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                decodedSentence.append(" ");
            }
            decodedSentence.append(decodeWord(words[i]));
        }
        System.out.println(decodedSentence);
    }
}
