package Easy;

import java.util.Scanner;

public class callforproblems {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfProblems = myScanner.nextInt();
        int excludedProblemsCounter = 0;

        for(int i = 0; i < numberOfProblems; i++){
            int currentProblem = myScanner.nextInt();
            if(currentProblem % 2 != 0){
                excludedProblemsCounter++;
            }
        }
        System.out.println(excludedProblemsCounter);
    }
}
