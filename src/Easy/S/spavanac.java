package Easy.S;

import java.util.Scanner;

public class spavanac {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int hour = myScanner.nextInt(); int minute = myScanner.nextInt();

        minute -= 45;
        if (minute < 0) {
            minute += 60;
            hour = (hour == 0) ? 23 : hour - 1;
        }

        System.out.println(hour + " " + minute);
    }
}
