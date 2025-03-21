package Easy.K;

import java.util.Scanner;

public class kleptography {
    public static char toChar(int x) {
        return (char) (((26 + x) % 26) + 'a');
    }

    public static int toNum(char x) {
        return x - 'a';
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int m = myScanner.nextInt();
        myScanner.nextLine();

        String last = myScanner.nextLine();
        String encrypted = myScanner.nextLine();

        // Initialize the plain text as an array of characters
        char[] plain = new char[m];

        // Fill in the last n characters of the plain text with the reversed order of 'last'
        for (int i = 0; i < n; i++) {
            plain[m - 1 - i] = last.charAt(n - 1 - i);
        }

        // Decrypt the remaining part of the plain text
        for (int i = m - n - 1; i >= 0; i--) {
            plain[i] = toChar(toNum(encrypted.charAt(i + n)) - toNum(plain[n + i]));

        }

        System.out.println(new String(plain));
    }
}
