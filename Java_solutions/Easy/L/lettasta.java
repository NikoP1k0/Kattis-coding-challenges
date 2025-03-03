package Easy.L;

import java.util.Scanner;

public class lettasta {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfProblems = myScanner.nextInt();
        int numberOfTeams = myScanner.nextInt();
        myScanner.nextLine();

        String[] problemNames = new String[numberOfProblems];
        for(int i = 0; i < numberOfProblems; i++){
            problemNames[i] = myScanner.next();
        }

        myScanner.nextLine();

        int[] totalScore = new int[numberOfProblems];
        for(int i = 0; i < numberOfTeams; i++){
            for(int j = 0; j < numberOfProblems; j++){
                totalScore[j] += myScanner.nextInt();
            }
        }

        int indexWithLargestScore = 0;
        int maxScore = 0;
        for(int i = 0; i < totalScore.length; i++){
            if(totalScore[i] > maxScore){
                maxScore = totalScore[i];
                indexWithLargestScore = i;
            }
        }

        System.out.println(problemNames[indexWithLargestScore]);
    }
}
