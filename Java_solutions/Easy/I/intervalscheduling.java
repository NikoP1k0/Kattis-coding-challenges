package Easy.I;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class intervalscheduling {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();

        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = myScanner.nextInt(); // start time
            intervals[i][1] = myScanner.nextInt(); // end time
        }

        // Sort intervals by end time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int count = 0;
        int lastEndTime = -1;
        for (int[] interval : intervals) {
            if (interval[0] >= lastEndTime) { // No overlap condition
                count++;
                lastEndTime = interval[1]; // Update last end time
            }
        }

        System.out.println(count);
    }
}
