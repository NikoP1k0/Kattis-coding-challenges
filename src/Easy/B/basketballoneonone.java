package Easy.B;

import java.util.Scanner;

public class basketballoneonone {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String record = myScanner.nextLine();
        int AliceScore = 0;
        int BarbaraScore = 0;

        for(int i = 0; i < record.length(); i++){
            int score = Integer.parseInt(String.valueOf(record.charAt(i + 1)));
            if(record.charAt(i) == 'A'){
                AliceScore += score;
                i = i + 1;
            } else if (record.charAt(i) == 'B') {
                BarbaraScore += score;
                i = i + 1;
            }
        }

        System.out.println((AliceScore > BarbaraScore ? "A" : "B"));
    }
}
