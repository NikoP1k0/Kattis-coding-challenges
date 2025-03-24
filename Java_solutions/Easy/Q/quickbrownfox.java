package Easy.Q;

import java.util.Scanner;

public class quickbrownfox {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        myScanner.nextLine();

        while (testCases-- > 0) {
            String phrase = myScanner.nextLine().toLowerCase(); // Convert to lowercase

            boolean[] seen = new boolean[26]; // Tracks if each letter 'a'-'z' appears

            // Mark letters that appear in the phrase
            for (char c : phrase.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    seen[c - 'a'] = true;
                }
            }

            // Collect missing letters
            StringBuilder missingLetters = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (!seen[i]) {
                    missingLetters.append((char) ('a' + i));
                }
            }

            if (missingLetters.length() == 0) {
                System.out.println("pangram");
            } else {
                System.out.println("missing " + missingLetters);
            }
        }
    }
}
