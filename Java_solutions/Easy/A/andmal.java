package Easy.A;

import java.util.Scanner;

public class andmal {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("a");
            return;
        }

        char firstChar = input.charAt(0);
        char newChar;

        if (firstChar != 'a') {
            newChar = 'a';
        } else {
            newChar = 'b';
        }


        StringBuilder output = new StringBuilder(input);
        output.setCharAt(0, newChar);
        System.out.println(output);
    }
}
