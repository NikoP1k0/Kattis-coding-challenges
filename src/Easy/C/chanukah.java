package Easy.C;

import java.util.Scanner;

public class chanukah {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        int[] testCaseNumber = new int[testCases];
        int[] daysOfHoliday = new int[testCases];

        for (int i = 0; i < testCases; i++) {
            testCaseNumber[i] = myScanner.nextInt();
            daysOfHoliday[i] = myScanner.nextInt();
        }

        int[]  candlesForEachTestCase = new int[testCases];
        for (int i = 0; i < daysOfHoliday.length; i++) {
            int calculatedCandles = 0;
            int temp = daysOfHoliday[i];

            for (int j = 0; j < daysOfHoliday[i]; j++) {
                calculatedCandles += temp;
                temp--;
            }

            candlesForEachTestCase[i] = calculatedCandles + daysOfHoliday[i];
        }

        for (int i = 0; i < testCases; i++) {
            System.out.println(testCaseNumber[i] + " " + candlesForEachTestCase[i]);
        }
    }
}
