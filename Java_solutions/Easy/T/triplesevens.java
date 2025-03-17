package Easy.T;

import java.util.Scanner;

public class triplesevens {
    public static void main(String[] args){
        Scanner myScanner  = new Scanner(System.in);
        int n = myScanner.nextInt();

        boolean[] isSeven = new boolean[3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < n; j++){
                int digit = myScanner.nextInt();
                if(digit == 7){
                    isSeven[i] = true;
                }
            }
        }

        for (boolean b : isSeven) {
            if (!b) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(777);
    }
}
