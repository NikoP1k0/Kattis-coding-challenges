package Easy;

import java.util.Scanner;

public class countthevowels {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String sentence = myScanner.nextLine();
        int vowelCounter = 0;

        for(int i = 0; i < sentence.length(); i++){
            switch(sentence.charAt(i)){
                case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u':
                    vowelCounter++;
                    break;
            }
        }

        System.out.println(vowelCounter);
    }
}
