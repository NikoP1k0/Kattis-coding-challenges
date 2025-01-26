package Rating_1To2;

import java.util.Scanner;

public class knotknowledge {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfKnots = myScanner.nextInt();
        int[] knotsToLearn = new int[numberOfKnots];
        int[] learnedKnots = new int[numberOfKnots - 1];

        for(int i = 0; i < numberOfKnots; i++){
            knotsToLearn[i] = myScanner.nextInt();
        }

        for(int i = 0; i < numberOfKnots - 1; i++){
            learnedKnots[i] = myScanner.nextInt();
        }

        int sumOfKnotsToLearn = 0;
        for(int knot : knotsToLearn){
            sumOfKnotsToLearn += knot;
        }

        int sumOfLearnedKnots = 0;
        for(int knot : learnedKnots){
            sumOfLearnedKnots += knot;
        }

        System.out.println(sumOfKnotsToLearn - sumOfLearnedKnots);
    }
}
