package Easy;

import java.util.HashMap;
import java.util.Scanner;

public class pokerhand {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        String[] hand = new String[5];
        for(int i = 0; i < 5; i++){
            hand[i] = myScanner.next();
        }

        HashMap<Character, Integer> rankCounts = new HashMap<>();

        for(String card : hand){
            char rank = card.charAt(0);
            rankCounts.put(rank, rankCounts.getOrDefault(rank, 0) + 1);
        }

        int maxStrength = 0;
        for (int count : rankCounts.values()) {
            maxStrength = Math.max(maxStrength, count);
        }

        System.out.println(maxStrength);
    }
}
