package Easy;

import java.util.Scanner;

public class isyavowel {
    public static void main(String[] main){
        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();
        int vowels = 0;
        int vowelsIncludingY = 0;

        for(int i = 0; i < word.length(); i++){
            switch(word.charAt(i)){
                case 'a', 'e', 'i', 'o', 'u':
                    vowels++;
                    vowelsIncludingY++;
                    break;
                case 'y':
                    vowelsIncludingY++;
                    break;
            }
        }

        System.out.println(vowels + " " + vowelsIncludingY);
    }
}
