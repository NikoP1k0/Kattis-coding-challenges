package Easy;

import java.util.HashMap;
import java.util.Scanner;

public class akureyri {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        int numberOfContestants = myScanner.nextInt();
        myScanner.nextLine(); // Consume the leftover newline

        HashMap<String, Integer> cityCount = new HashMap<>();
        for(int i = 0; i < numberOfContestants; i++){
            String name = myScanner.nextLine(); // We don't use this
            String city = myScanner.nextLine();

            if(cityCount.containsKey(city)){
                cityCount.put(city, cityCount.get(city) + 1);
            } else {
                cityCount.put(city, 1);
            }
        }

        cityCount.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
