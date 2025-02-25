package Easy.L;

import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;

public class licensetolaunch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int days = myScanner.nextInt();
        int minSpaceJunk = MAX_VALUE;
        int daysToWait = 0;

        for(int i = 0; i < days; i++){
            int currentDayJunk = myScanner.nextInt();

            if(currentDayJunk < minSpaceJunk){
                daysToWait = i;
                minSpaceJunk = currentDayJunk;

            }
        }

        System.out.println(daysToWait);
    }
}
