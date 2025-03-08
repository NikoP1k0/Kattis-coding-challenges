package Easy.B;

import java.util.Scanner;

public class bannord {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String forbidden = myScanner.nextLine();
        String memo = myScanner.nextLine();
        String[] words = memo.split(" ");

        for (int i = 0; i < words.length; i++) {
            for (char c : forbidden.toCharArray()) {
                if (words[i].indexOf(c) != -1) {
                    words[i] = "*".repeat(words[i].length());
                    break;
                }
            }
        }

        System.out.println(String.join(" ", words));
    }
}
