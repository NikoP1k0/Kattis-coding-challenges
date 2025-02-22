package Easy.F;

import java.util.Scanner;

public class fjoldibokstafa {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String sentence = myScanner.nextLine();
        int letterCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            if (Character.isLetter(currentChar)) {
                letterCount++;
            }
        }

        System.out.println(letterCount);
    }
}
