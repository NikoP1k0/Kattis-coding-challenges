package Easy;

import java.util.Scanner;

public class greetings2 {
    public static void main(String[] main){
        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();
        int count = 0;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'e'){
                count++;
            }
        }

        String eSequence = "e".repeat(2 * count);
        StringBuilder output = new StringBuilder();
        System.out.println(output.append('h').append(eSequence).append('y'));
    }
}
