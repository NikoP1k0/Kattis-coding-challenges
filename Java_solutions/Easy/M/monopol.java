package Easy.M;

import java.util.Scanner;

public class monopol {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfHotels = myScanner.nextInt();
        int[] distances = new int[numberOfHotels];
        double probability = 0;

        for(int i = 0; i < numberOfHotels; i++){
            distances[i] = myScanner.nextInt();
        }

        for(int i = 0; i < numberOfHotels; i++){
            switch (distances[i]) {
                case 2, 12 -> probability += (double) 1 / 36;
                case 3, 11 -> probability += (double) 1 / 18;
                case 4, 10 -> probability += (double) 1 / 12;
                case 5, 9 -> probability += (double) 1 / 9;
                case 6, 8 -> probability += (double) 5 / 36;
                case 7 -> probability += (double) 1 / 6;
            }
        }

        System.out.println(probability);
    }
}
