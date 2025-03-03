package Easy.T;

import java.util.Scanner;

public class training {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int numProblems = myScanner.nextInt();
        int ashleysSkill = myScanner.nextInt();

        for(int i = 0; i < numProblems; i++){
            int lower = myScanner.nextInt();
            int upper = myScanner.nextInt();

            if(ashleysSkill >= lower && ashleysSkill <= upper){
                ashleysSkill++;
            }
        }

        System.out.println(ashleysSkill);
    }
}
