package Easy.C;

import java.util.Scanner;

public class cosmicpathoptimization {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfTemps = myScanner.nextInt();
        int sum = 0;

        for(int i = 0; i < numberOfTemps; i++){
            sum += myScanner.nextInt();
        }

        System.out.println(sum/numberOfTemps);
    }
}
