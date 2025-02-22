package Easy.V;

import java.util.Scanner;

public class vedurheidar {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int windSpeed = myScanner.nextInt();
        int roads = myScanner.nextInt();
        myScanner.nextLine();

        for (int i = 0; i < roads; i++) {
            String currentRoad = myScanner.next();
            int currentRoadMaximumSpeed = myScanner.nextInt();
            System.out.println(currentRoadMaximumSpeed >= windSpeed ? currentRoad + " opin" : currentRoad + " lokud");
        }
    }
}
