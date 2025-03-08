package Easy.C;

import java.util.Scanner;

public class canadianseh {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String sentence = myScanner.nextLine().trim();

        if (sentence.endsWith("eh?")) {
            int index = sentence.lastIndexOf("eh?");

            if (index == 0 || sentence.charAt(index - 1) == ' ') {
                System.out.println("Canadian!");
                return;
            }
        }

        System.out.println("Imposter!");
    }
}
