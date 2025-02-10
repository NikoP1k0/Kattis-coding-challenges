package Easy;

import java.util.Scanner;

public class ratingproblems {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfJudges = myScanner.nextInt(); int judgesThatHasSubmitted = myScanner.nextInt();

        int submittedSum = 0;
        for(int i = 0; i < judgesThatHasSubmitted; i++){
            submittedSum += myScanner.nextInt();
        }

        double remainingNegativeSum = (numberOfJudges - judgesThatHasSubmitted) * -3;
        double remainingPositiveSum = (numberOfJudges - judgesThatHasSubmitted) * 3;

        System.out.println(((submittedSum + remainingNegativeSum) / numberOfJudges) + " " + ((submittedSum + remainingPositiveSum) / numberOfJudges));
    }
}
