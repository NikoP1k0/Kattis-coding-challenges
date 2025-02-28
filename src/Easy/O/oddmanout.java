package Easy.O;

import java.util.HashMap;
import java.util.Scanner;

public class oddmanout {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        int[] results = new int[testCases];

        for(int i = 0; i < testCases; i++){
            int guests = myScanner.nextInt();
            HashMap<Integer, Integer> guestCount = new HashMap<>();

            for(int j = 0; j < guests; j++){
                int currentGuest = myScanner.nextInt();
                if(guestCount.containsKey(currentGuest)){
                    int currentCount = guestCount.get(currentGuest);
                    guestCount.replace(currentGuest, currentCount + 1);
                } else{
                    guestCount.put(currentGuest, 1);
                }
            }

            for(Integer key : guestCount.keySet()){
                if(guestCount.get(key) == 1){
                    results[i] = key;
                }
            }

            guestCount.clear();
        }


        for(int i = 0; i < testCases; i++){
            System.out.println("Case #" + (i + 1) + ": " + results[i]);
        }
    }
}
