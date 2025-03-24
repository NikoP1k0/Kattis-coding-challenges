package Easy.P;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class plantingtrees {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numTrees = myScanner.nextInt();

        Integer[] treeGrowthTime = new Integer[numTrees];
        for(int i = 0; i < numTrees; i++){
            treeGrowthTime[i] = myScanner.nextInt();
        }

        Arrays.sort(treeGrowthTime, Collections.reverseOrder());

        int maxDay = 0;
        for (int i = 0; i < numTrees; i++) {
            int maturityDay = i + 1 + treeGrowthTime[i]; // Planting day + Growth time
            maxDay = Math.max(maxDay, maturityDay);
        }

        System.out.println(maxDay + 1);
    }
}
