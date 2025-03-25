package Easy.T;

import java.util.Scanner;

public class trulstrubbel {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String gameLog = myScanner.nextLine();

        int trulsScore = 0, henryScore = 0;

        for (char point : gameLog.toCharArray()) {
            if (point == 'T') {
                trulsScore++;
            } else if (point == 'H') {
                henryScore++;
            }

            // Check if a player wins the match
            if ((trulsScore >= 11 || henryScore >= 11) && Math.abs(trulsScore - henryScore) >= 2) {
                trulsScore = 0;
                henryScore = 0;
            }
        }

        System.out.println(trulsScore + "-" + henryScore);
    }
}
