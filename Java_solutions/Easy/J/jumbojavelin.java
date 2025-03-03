package Easy.J;

import java.util.Scanner;

public class jumbojavelin {
    public static void main(String[] main){
        Scanner myScanner = new Scanner(System.in);
        int numberOfRods = myScanner.nextInt();
        int lengthOfRod = 0;

        for(int i = 0; i < numberOfRods; i++){
            lengthOfRod += myScanner.nextInt();
        }

        System.out.println(lengthOfRod - numberOfRods + 1);
    }
}
