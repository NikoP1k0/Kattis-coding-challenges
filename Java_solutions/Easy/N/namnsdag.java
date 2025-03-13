package Easy.N;

import java.util.Scanner;

public class namnsdag {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String friendName = myScanner.nextLine();
        int n = myScanner.nextInt();
        myScanner.nextLine();

        String[] nameDays = new String[n];
        for (int i = 0; i < n; i++) {
            nameDays[i] = myScanner.nextLine();
        }

        int minDays = n;  // Initially set it to the maximum (friend will have to wait a year)

        // Iterate over all name days except the last one (because it is the friend's name today)
        for (int i = 0; i < n - 1; i++) {
            String name = nameDays[i];
            // Check if we can change one letter of friendName to get the current name
            if (canChangeByOne(friendName, name)) {
                minDays = Math.min(minDays, i + 1);  // Calculate days ahead
            }
        }
        System.out.println(minDays);
    }

    public static boolean canChangeByOne(String name1, String name2) {
        if (name1.length() != name2.length()) {
            return false;
        }

        int diffCount = 0;
        for (int i = 0; i < name1.length(); i++) {
            if (name1.charAt(i) != name2.charAt(i)) {
                diffCount++;
                if (diffCount > 1) {
                    return false;  // More than one difference, so return false
                }
            }
        }

        // If there is exactly one difference, return true
        return diffCount == 1;
    }
}
