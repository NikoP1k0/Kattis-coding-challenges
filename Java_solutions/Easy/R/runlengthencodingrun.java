package Easy.R;

import java.util.Scanner;

public class runlengthencodingrun {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String letter = myScanner.next();
        String text = myScanner.next();
        System.out.println(letter.equals("E") ? encodeMsg(text) : decodeMsg(text));
    }

    public static StringBuilder encodeMsg(String message){
        StringBuilder encodedMsg = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            int count = 1;

            while (i + 1 < message.length() && message.charAt(i + 1) == currentChar) {
                i++;
                count++;
            }

            encodedMsg.append(currentChar).append(count);
        }

        return encodedMsg;
    }

    public static StringBuilder decodeMsg(String message){
        StringBuilder decodedMsg = new StringBuilder();

        for (int i = 0; i < message.length() - 1; i += 2) {
            char currentChar = message.charAt(i);
            int repeats = Integer.parseInt(String.valueOf(message.charAt(i + 1)));
            decodedMsg.append(String.valueOf(currentChar).repeat(repeats));
        }

        return decodedMsg;
    }
}
