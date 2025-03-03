package Easy.G;

import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] thresholds = {myScanner.nextInt(), myScanner.nextInt(), myScanner.nextInt(), myScanner.nextInt(), myScanner.nextInt()};
        char[] grades = {'A', 'B', 'C', 'D', 'E'};
        int grade = myScanner.nextInt();

        for (int i = 0; i < thresholds.length; i++) {
            if (grade >= thresholds[i]) {
                System.out.println(grades[i]);
                return;
            }
        }
        System.out.println('F');
    }
}
