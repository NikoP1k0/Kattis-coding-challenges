package Easy.C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class composedrhythms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Integer> groups = new ArrayList<>();

        // First, use as many 3s as possible
        int numThrees = N / 3;
        int remainder = N % 3;

        // If remainder is 1, adjust by replacing one "3" with two "2s"
        if (remainder == 1) {
            numThrees -= 1;
            remainder += 3; // Now remainder becomes 4, which we split as "2 2"
        }

        // Add "3s" to the result
        for (int i = 0; i < numThrees; i++) {
            groups.add(3);
        }

        // Add "2s" if needed
        while (remainder > 0) {
            groups.add(2);
            remainder -= 2;
        }

        // Output the results
        System.out.println(groups.size());
        for (int num : groups) {
            System.out.print(num + " ");
        }
    }
}
