package Rating_1To2;

import java.util.Scanner;

public class keysphonewallet {
    public static void main(String[] main){
        Scanner myScanner = new Scanner(System.in);
        int numberOfItems = myScanner.nextInt();
        myScanner.nextLine(); // Clear
        String[] itemsOfInterest = {"keys", "phone", "wallet"};
        boolean[] foundItems = new boolean[3];

        for(int i = 0; i< numberOfItems; i++){
            String item = myScanner.nextLine();

            for(int j = 0; j < 3; j++) {
                if (item.contains(itemsOfInterest[j])) {
                    foundItems[j] = true;
                }
            }
        }

        boolean allFound = true;
        for(int i = 0; i < 3; i++){
            if(!foundItems[i]){
               allFound = false;
               System.out.println(itemsOfInterest[i]);
            }
        }

        if(allFound){
            System.out.println("ready");
        }
    }
}
