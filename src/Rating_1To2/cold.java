package Rating_1To2;

import java.util.Scanner;

public class cold {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfTemps = myScanner.nextInt();
        int numberOfNegativeTemps = 0;

        for(int i = 0; i < numberOfTemps; i++){
            int currentTemp = myScanner.nextInt();
            if(currentTemp < 0){
                numberOfNegativeTemps++;
            }
        }
        System.out.println(numberOfNegativeTemps);
    }
}
