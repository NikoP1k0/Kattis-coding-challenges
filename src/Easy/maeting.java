package Easy;

import java.util.*;

public class maeting {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int mondayAttendance = myScanner.nextInt(); int tuesdayAttendance = myScanner.nextInt();

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>(); // Maintain order
        HashSet<Integer> secondSet = new HashSet<>(); // Quick lookup for common elements


        for (int i = 0; i < mondayAttendance; i++) {
            firstSet.add(myScanner.nextInt());
        }

        for (int i = 0; i < tuesdayAttendance; i++) {
            secondSet.add(myScanner.nextInt());
        }

        // Print only the numbers that exist in both sets, in the order from firstSet
        for (int number : firstSet) {
            if (secondSet.contains(number)) {
                System.out.print(number + " ");
            }
        }
    }
}
