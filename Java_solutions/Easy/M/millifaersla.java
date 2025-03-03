package Easy.M;

import java.util.Scanner;

public class millifaersla {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int lowestFee = myScanner.nextInt();;
        String name = "Monnei";

        for(int i = 1; i < 3; i++){
            int currentFee = myScanner.nextInt();

            if(lowestFee > currentFee){
                lowestFee = currentFee;

                if(i == 1){
                    name = "Fjee";
                } else if(i == 2){
                    name = "Dolladollabilljoll";
                }
            }
        }

        System.out.println(name);
    }
}
