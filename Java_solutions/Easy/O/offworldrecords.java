package Easy.O;

import java.util.Scanner;

public class offworldrecords {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int N = myScanner.nextInt();
        int currentRecord = myScanner.nextInt();
        int previousRecord = myScanner.nextInt();

        int newRecords = 0;
        for (int i = 0; i < N; i++) {
            int jumpHeight = myScanner.nextInt();

            if (jumpHeight > currentRecord + previousRecord) {
                newRecords++;

                // Update records
                previousRecord = currentRecord;
                currentRecord = jumpHeight;
            }
        }

        System.out.println(newRecords);
    }
}
