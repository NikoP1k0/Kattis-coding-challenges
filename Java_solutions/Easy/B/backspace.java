package Easy.B;

import java.util.Scanner;

public class backspace {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();

        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c == '<') {
                if (output.length() > 0) {
                    output.deleteCharAt(output.length() - 1);
                }
            } else {
                output.append(c);
            }
        }

        System.out.println(output);
    }
}
