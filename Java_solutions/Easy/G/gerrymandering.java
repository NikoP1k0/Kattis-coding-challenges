package Easy.G;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class gerrymandering {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int P = myScanner.nextInt(); // Number of precincts
        int D = myScanner.nextInt(); // Number of districts

        // Store votes per district
        Map<Integer, Integer> votesA = new HashMap<>();
        Map<Integer, Integer> votesB = new HashMap<>();

        for (int i = 0; i < P; i++) {
            int district = myScanner.nextInt();
            int voteA = myScanner.nextInt();
            int voteB = myScanner.nextInt();

            votesA.put(district, votesA.getOrDefault(district, 0) + voteA);
            votesB.put(district, votesB.getOrDefault(district, 0) + voteB);
        }

        int totalVotes = 0;
        int totalWastedA = 0, totalWastedB = 0;

        for (int d = 1; d <= D; d++) {
            int aVotes = votesA.getOrDefault(d, 0);
            int bVotes = votesB.getOrDefault(d, 0);
            int districtTotal = aVotes + bVotes;
            int majority = (districtTotal / 2) + 1;
            totalVotes += districtTotal;

            if (aVotes > bVotes) {
                int wastedA = aVotes - majority;
                int wastedB = bVotes;
                totalWastedA += wastedA;
                totalWastedB += wastedB;
                System.out.println("A " + wastedA + " " + wastedB);
            } else {
                int wastedB = bVotes - majority;
                int wastedA = aVotes;
                totalWastedA += wastedA;
                totalWastedB += wastedB;
                System.out.println("B " + wastedA + " " + wastedB);
            }
        }

        // Compute and print efficiency gap
        double efficiencyGap = Math.abs(totalWastedA - totalWastedB) / (double) totalVotes;
        System.out.printf("%.10f%n", efficiencyGap);
    }
}
