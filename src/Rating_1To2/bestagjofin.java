package Rating_1To2;

import java.util.Scanner;

public class bestagjofin {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfGuests = myScanner.nextInt();
        int maxValue = 0;
        String currentBestGiftGiver = null;

        for(int i = 0; i < numberOfGuests; i++){
            String name = myScanner.next();
            int gifts = myScanner.nextInt();

            if(maxValue < gifts){
                maxValue = gifts;
                currentBestGiftGiver = name;
            }
        }

        System.out.println(currentBestGiftGiver);
    }
}
