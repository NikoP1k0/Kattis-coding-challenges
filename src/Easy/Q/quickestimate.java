package Easy.Q;

import java.util.Scanner;

public class quickestimate {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        myScanner.nextLine();

        for(int i = 0; i < testCases; i++){
            String estimation = myScanner.nextLine();
            int count = 0;

            for(int j = 0; j < estimation.length(); j++){
                count++;
            }

            System.out.println(count);
        }
    }
}
