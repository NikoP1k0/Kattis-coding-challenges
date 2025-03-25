package Easy.V;

import java.util.Scanner;

public class volim {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int currentPlayer = myScanner.nextInt();
        int questions = myScanner.nextInt();

        int totalTime = 0;
        for (int i = 0; i < questions; i++) {
            int time = myScanner.nextInt();
            char answerType = myScanner.next().charAt(0);

            totalTime += time;

            if (totalTime >= 210) {
                break;
            }

            if (answerType == 'T') {
                currentPlayer = (currentPlayer % 8) + 1;
            }
        }

        System.out.println(currentPlayer);
    }
}
