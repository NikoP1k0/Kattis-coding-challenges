package Easy.S;

import java.util.Scanner;

public class skruop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int requests = myScanner.nextInt();
        myScanner.nextLine();

        int currentVolume = 7;
        for(int i = 0; i < requests; i++){
            String currentRequest = myScanner.nextLine();

            if(currentRequest.equals("Skru op!") && currentVolume != 10){
                currentVolume++;
            } else if(currentRequest.equals("Skru ned!") && currentVolume != 0) {
                currentVolume--;
            }
        }

        System.out.println(currentVolume);
    }
}
