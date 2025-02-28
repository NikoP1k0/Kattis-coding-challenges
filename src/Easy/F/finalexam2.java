package Easy.F;

import java.util.Scanner;

public class finalexam2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int questions = myScanner.nextInt();
        myScanner.nextLine();

        String[] answerSheet = new String[questions];
        String[] actualSheet = new String[questions + 1];
        actualSheet[0] = "NaN";

        for(int i = 0; i < questions; i++){

            answerSheet[i] = myScanner.nextLine();
            actualSheet[i + 1] = answerSheet[i];
        }

        int correctAnswers = 0;
        for(int i = 0; i < questions; i++){
            if(answerSheet[i].equals(actualSheet[i])){
                correctAnswers++;
            }
        }

        System.out.println(correctAnswers);
    }
}
