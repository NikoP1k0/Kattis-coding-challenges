package Easy.C;

import java.util.Scanner;

public class champernowneverification {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String N = myScanner.nextLine();

        int k = 0;

        for(int i = 0; i < N.length(); i++){
            int currentDigit = Integer.parseInt(String.valueOf(N.charAt(i)));

            if(currentDigit == k + 1){
                k++;
            } else{
                System.out.println(-1);
                return;
            }
        }

        System.out.println(k);
    }
}
