package Easy.S;

import java.util.Scanner;

public class stickykeys {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String sentence = myScanner.nextLine();

        StringBuilder newSentence = new StringBuilder();
        newSentence.append(sentence.charAt(0));
        for(int i = 1; i < sentence.length(); i++){
            char currentChar = sentence.charAt(i);
            if(currentChar != sentence.charAt(i - 1)){
                newSentence.append(currentChar);
            }
        }

        System.out.println(newSentence);
    }
}
