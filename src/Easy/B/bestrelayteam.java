package Easy.B;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Runner {
    String name;
    double firstLegTime;
    double flyingLegTime;

    public Runner(String name, double firstLegTime, double flyingLegTime) {
        this.name = name;
        this.firstLegTime = firstLegTime;
        this.flyingLegTime = flyingLegTime;
    }
}

public class bestrelayteam {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfRunners = myScanner.nextInt();
        myScanner.nextLine();

        List<Runner> runners = new ArrayList<>();

        for (int i = 0; i < numberOfRunners; i++) {
            String[] data = myScanner.nextLine().split(" ");
            String name = data[0];
            double firstLegTime = Double.parseDouble(data[1]);
            double flyingLegTime = Double.parseDouble(data[2]);
            runners.add(new Runner(name, firstLegTime, flyingLegTime));
        }

        double bestTime = Double.MAX_VALUE;
        List<Runner> bestTeam = new ArrayList<>();

        for (Runner firstRunner : runners) {
            List<Runner> remaining = new ArrayList<>(runners);
            remaining.remove(firstRunner);

            // Sort remaining runners by flying leg time
            remaining.sort(Comparator.comparingDouble(r -> r.flyingLegTime));

            // Pick the 3 fastest for the other legs
            List<Runner> team = new ArrayList<>();
            team.add(firstRunner);
            team.add(remaining.get(0));
            team.add(remaining.get(1));
            team.add(remaining.get(2));

            // Compute total time
            double totalTime = firstRunner.firstLegTime +
                    remaining.get(0).flyingLegTime +
                    remaining.get(1).flyingLegTime +
                    remaining.get(2).flyingLegTime;

            // Update best team
            if (totalTime < bestTime) {
                bestTime = totalTime;
                bestTeam = new ArrayList<>(team);
            }
        }

        System.out.printf("%.2f%n", bestTime);
        for (Runner runner : bestTeam) {
            System.out.println(runner.name);
        }
    }
}
