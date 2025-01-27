package Easy;

import java.util.Scanner;

public class A_Second_Opinion {

    private static String SecondsToTimeCalculator(int seconds){

        if(0 > seconds || seconds > 1000000){
            return "Outside input range";
        }

        int Hours = seconds / (60 * 60);
        int remainingSeconds = seconds % (60 * 60);

        int Minutes = remainingSeconds / 60;
        int finalSeconds = remainingSeconds % 60;

        return Hours + " " + ":" + " " + Minutes + " " + ":" + " " + finalSeconds;
    }

    public static void main(String[] args){

        Scanner SecondScanner = new Scanner(System.in);
        String Seconds = SecondScanner.nextLine();

        int sec;
        try {
            sec = Integer.parseInt(Seconds);
        } catch (NumberFormatException e){
            sec = -1;
        }

        System.out.println(SecondsToTimeCalculator(sec));

    }
}
