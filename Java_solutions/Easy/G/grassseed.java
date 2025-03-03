package Easy.G;

import java.util.Scanner;

public class grassseed {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        double costForOneSquareMeter = myScanner.nextDouble();
        int numberOfLawns = myScanner.nextInt();
        double sumSquareMeters = 0;

        for(int i = 0; i < numberOfLawns; i++){
            double width = myScanner.nextDouble();
            double length = myScanner.nextDouble();
            sumSquareMeters += width * length;
        }

        System.out.println(sumSquareMeters * costForOneSquareMeter);
    }
}
