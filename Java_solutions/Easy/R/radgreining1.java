package Easy.R;

import java.util.Arrays;
import java.util.Scanner;

public class radgreining1 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int m = myScanner.nextInt();
        myScanner.nextLine();

        char[] dna = new char[n];
        boolean[] known = new boolean[n];

        Arrays.fill(dna, '?'); // Start with all unknowns

        for (int i = 0; i < m; i++) {
            int start = myScanner.nextInt() - 1; // Convert to zero-based index
            String seq = myScanner.next(); // DNA sequence

            for (int j = 0; j < seq.length(); j++) {
                int pos = start + j;
                if (pos >= n) break; // Ensure we don't go out of bounds

                if (!known[pos]) {
                    dna[pos] = seq.charAt(j);
                    known[pos] = true;
                } else if (dna[pos] != seq.charAt(j)) {
                    System.out.println("Villa"); // Contradiction found
                    return;
                }
            }
        }

        System.out.println(new String(dna));
    }
}
