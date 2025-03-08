package Easy.C;

import java.util.Scanner;

public class cypherdecypher {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String encoder = myScanner.nextLine();
        int n = myScanner.nextInt();
        myScanner.nextLine();


        for(int i = 0; i < n; i++){
            String message = myScanner.nextLine();
            StringBuilder encodedMessage = new StringBuilder();

            for(int j = 0; j < message.length(); j++){
                int multiplier = encoder.charAt(j % encoder.length()) - '0';
                int letterVal = message.charAt(j) - 'A';
                int newVal = (multiplier * letterVal) % 26;

                char encodedLetter = (char) ('A' + newVal);  // Convert back to letter
                encodedMessage.append(encodedLetter);
            }

            System.out.println(encodedMessage);
        }
    }
}
