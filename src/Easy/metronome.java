package Easy;

import java.util.Scanner;

public class metronome {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        double ticks = myScanner.nextDouble();
        System.out.println(ticks/4);
    }
}
