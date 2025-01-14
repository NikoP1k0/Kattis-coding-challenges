package Rating_1To2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class ACMContestScoring {

    private static int TimeCalculator(int[] minutes, char[] problems, String[] results){

        // Check which problems to be ignored
        HashSet<Character> solvedProblems = new HashSet<>();

        for(int i = 0; i < problems.length; i++){
            if(results[i].equals("right")){
                solvedProblems.add(problems[i]);
            }
        }

        // Time calculations including penalty
        int penaltyTime = 0;
        int completionTime = 0;

        for(int i = 0; i < problems.length; i++) {
            char currentProblem = problems[i];

            if (solvedProblems.contains(currentProblem)) {
                if (results[i].equals("wrong")) {
                    penaltyTime += 20;
                }
                if(results[i].equals("right")){
                    completionTime += minutes[i];
                }
            }
        }

        return penaltyTime + completionTime;
    }



    private static int SolvedProblemsCalculator(String[] results){
        // Total problems solved
        int SolvedProblemsCount = 0;
        for (String result : results) {
            if (Objects.equals(result, "right")) {
                SolvedProblemsCount++;
            }
        }

        return SolvedProblemsCount;
    }

    public static void main(String[] args){
        Scanner MyScanner = new Scanner(System.in);

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();

        while(MyScanner.hasNextLine()){
            String line = MyScanner.nextLine().trim();

            if(line.equals("-1")) break;

            String[] parts = line.split(" ");
            if(parts.length == 3){

                int number = Integer.parseInt(parts[0]);

                if(number == -1) break;

                integers.add(number);
                letters.add(parts[1].charAt(0));
                words.add(parts[2]);
            } else {
                System.out.println("Invalid input format. Expected: <integer> <letter> <word>");
            }
        }

        int[] integerArray = integers.stream().mapToInt(i -> i).toArray();
        char[] letterArray = new char[letters.size()];
        for (int i = 0; i < letters.size(); i++) {
            letterArray[i] = letters.get(i);
        }
        String[] wordArray = words.toArray(new String[0]);

        System.out.println(SolvedProblemsCalculator(wordArray) + " " + TimeCalculator(integerArray, letterArray, wordArray));
    }
}
