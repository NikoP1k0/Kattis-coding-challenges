package Easy.K;

import java.util.Scanner;

public class kikiboba {
    public static void main(String[] main){
        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();
        int k_count = 0;
        int b_count = 0;

        for (char c : word.toCharArray()) {
            if (c == 'k') k_count++;
            else if (c == 'b') b_count++;
        }

        if (k_count > b_count) {
            System.out.println("kiki");
        } else if (b_count > k_count) {
            System.out.println("boba");
        } else {
            System.out.println(k_count == 0 ? "none" : "boki");
        }
    }
}
