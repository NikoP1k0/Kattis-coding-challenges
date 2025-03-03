package Easy.C;

import java.util.Scanner;

public class cutthenegativity {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfCities = myScanner.nextInt();
        int[][] negativeMatrix = new int[numberOfCities][numberOfCities];

        // Fetch table
        for(int i = 0; i < numberOfCities; i++){
            for(int j = 0; j < numberOfCities; j++){
                negativeMatrix[i][j] = myScanner.nextInt();
            }
        }

        // Count the number of direct flights
        int numberOfDirectFlights = 0;
        for (int i = 0; i < negativeMatrix.length; i++) {
            for (int j = 0; j < negativeMatrix[i].length; j++) {
                if (negativeMatrix[i][j] > 0) {
                    numberOfDirectFlights++;
                }
            }
        }

        // Get the positive array
        int[][] positiveMatrix = new int[numberOfDirectFlights][3];
        int index = 0;
        for(int i = 0; i < negativeMatrix.length; i++){
            for (int j = 0; j < negativeMatrix[i].length; j++) {
                if (negativeMatrix[i][j] != -1) {
                    positiveMatrix[index][0] = i + 1;
                    positiveMatrix[index][1] = j + 1;
                    positiveMatrix[index][2] = negativeMatrix[i][j];
                    index++;
                }
            }
        }

        // Print the positive array
        System.out.println(numberOfDirectFlights);
        for (int i = 0; i < positiveMatrix.length; i++) {
            System.out.println(positiveMatrix[i][0] + " " + positiveMatrix[i][1] + " " + positiveMatrix[i][2]);
        }
    }
}
