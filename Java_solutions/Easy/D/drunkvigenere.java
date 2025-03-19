package Easy.D;

import java.util.Scanner;

public class drunkvigenere {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String encrypted = myScanner.nextLine();
        String key = myScanner.nextLine();

        StringBuilder decrypted = new StringBuilder();
        int length = encrypted.length();

        for (int i = 0; i < length; i++) {
            char cipherChar = encrypted.charAt(i);
            char keyChar = key.charAt(i);

            int shift = keyChar - 'A'; // Convert key letter to shift value

            char decryptedChar;
            if (i % 2 == 0) {
                // Even index: shift backwards
                decryptedChar = (char) ((cipherChar - shift - 'A' + 26) % 26 + 'A');
            } else {
                // Odd index: shift forwards
                decryptedChar = (char) ((cipherChar + shift - 'A') % 26 + 'A');
            }

            decrypted.append(decryptedChar);
        }

        System.out.println(decrypted);
    }
}
