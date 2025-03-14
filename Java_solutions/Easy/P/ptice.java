package Easy.P;

import java.util.ArrayList;
import java.util.Scanner;

public class ptice {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int questions = myScanner.nextInt();
        myScanner.nextLine();
        String correctAnswers = myScanner.nextLine();

        String adrianPattern = "ABC";
        String brunoPattern = "BABC";
        String goranPattern = "CCAABB";
        int adrianScore = 0, brunoScore = 0, goranScore = 0;

        for (int i = 0; i < questions; i++) {
            char correct = correctAnswers.charAt(i);

            if (correct == adrianPattern.charAt(i % adrianPattern.length())) {
                adrianScore++;
            }
            if (correct == brunoPattern.charAt(i % brunoPattern.length())) {
                brunoScore++;
            }
            if (correct == goranPattern.charAt(i % goranPattern.length())) {
                goranScore++;
            }
        }

        // Determine maximum score
        int maxScore = Math.max(adrianScore, Math.max(brunoScore, goranScore));

        // Collect names of the winners
        ArrayList<String> winners = new ArrayList<>();
        if (adrianScore == maxScore) winners.add("Adrian");
        if (brunoScore == maxScore) winners.add("Bruno");
        if (goranScore == maxScore) winners.add("Goran");

        System.out.println(maxScore);
        for (String winner : winners) {
            System.out.println(winner);
        }
    }
}
