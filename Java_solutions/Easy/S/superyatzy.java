package Easy.S;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class superyatzy {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int m = myScanner.nextInt();

        Map<Integer, Integer> diceRoll = new HashMap<>();
        for(int i = 0; i < n; i++){
            int diceResult = myScanner.nextInt();
            diceRoll.put(diceResult, diceRoll.getOrDefault(diceResult, 0) + 1);
        }

        int maxCount = 0;
        for (int count : diceRoll.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        int neededChanges = n - maxCount;
        if (neededChanges <= m) {
            System.out.println("Ja");
        } else {
            System.out.println("Nej");
        }
    }
}
