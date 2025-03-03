package Easy.D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class dicecup {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int Dice1Face = myScanner.nextInt();
        int Dice2Face = myScanner.nextInt();

        int[] frequency = new int[(Dice1Face + Dice2Face) - 1];

        for (int dice1 = 1; dice1 <= Dice1Face; dice1++) {
            for (int dice2 = 1; dice2 <= Dice2Face; dice2++) {
                int sum = dice1 + dice2;
                frequency[sum - 2]++;
            }
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
            }
        }

        // Store sums with the highest frequency in a list
        List<Integer> mostLikelySums = new ArrayList<>();
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == maxFrequency) {
                mostLikelySums.add(i + 2); // sum is the index + 2
            }
        }

        // Print the most likely sums sorted in ascending order
        Collections.sort(mostLikelySums);
        for (int sum : mostLikelySums) {
            System.out.println(sum);
        }
    }
}
