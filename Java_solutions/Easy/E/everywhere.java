package Easy.E;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class everywhere {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        Set<String> uniqueCities = new HashSet<>();
        int[] numberOfUniqueCities = new int[testCases];

        for(int i = 0; i < testCases; i++){
            int numberOfCities = myScanner.nextInt();
            myScanner.nextLine();
            for(int j = 0; j < numberOfCities; j++){
                String city = myScanner.nextLine();
                uniqueCities.add(city);
            }

            numberOfUniqueCities[i] = uniqueCities.size();
            uniqueCities.clear();
        }

        for (int numberOfUniqueCity : numberOfUniqueCities) {
            System.out.println(numberOfUniqueCity);
        }
    }
}
