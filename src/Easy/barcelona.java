package Easy;

import java.util.Scanner;

public class barcelona {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfBags = myScanner.nextInt(); int BennisBagPosition = myScanner.nextInt();
        int[] allBagPositions = new int[numberOfBags];

        // Fetch all the bag positions
        for(int i = 0; i < numberOfBags; i++){
            allBagPositions[i] = myScanner.nextInt();
        }

        int position = 0;
        for (int i = 0; i < numberOfBags; i++) {
            if (allBagPositions[i] == BennisBagPosition) {
                position = i + 1; // Convert to 1-based index
                break;
            }
        }

        if(position == 1){
            System.out.println("fyrst");
        } else if(position == 2){
            System.out.println("naestfyrst");
        } else{
            System.out.println(position + " fyrst");
        }

    }
}
