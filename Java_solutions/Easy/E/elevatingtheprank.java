package Easy.E;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class elevatingtheprank {
    public static void main(String[] args){
        Scanner myScanner  = new Scanner(System.in);
        int start = myScanner.nextInt();
        int destination = myScanner.nextInt();
        int stops = myScanner.nextInt();

        int[] floors = new int[stops];
        for(int i = 0; i < stops; i++){
            floors[i] = myScanner.nextInt();
        }
        Arrays.sort(floors);

        ArrayList<Integer> prankFloors = new ArrayList<>();
        for (int floor : floors) {
            if ((floor < start && floor >= destination) ||
                    (floor > start && floor <= destination)) {
                prankFloors.add(floor);
            }
        }

        // Calculate the time
        int travelTime = Math.abs(destination - start) * 4;
        int stopTime = prankFloors.size() * 10;

        if (prankFloors.contains(destination)) {
            stopTime -= 10;
        }

        System.out.println(travelTime + stopTime);
    }
}
