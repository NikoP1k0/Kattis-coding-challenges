package Easy.K;

import java.util.Scanner;

public class kinahvisl {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String initialWord = myScanner.nextLine();
        String finalWord = myScanner.nextLine();

        int differentLetterCount = 1;
        for(int i = 0; i < initialWord.length(); i++){
            if(initialWord.charAt(i) != finalWord.charAt(i)){
                differentLetterCount++;
            }
        }

        System.out.println(differentLetterCount);
    }
}
