package Easy.C;

import java.util.*;

public class conformity {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        myScanner.nextLine();

        Map<String, Integer> courseCombinations = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] courses = myScanner.nextLine().split(" ");
            Arrays.sort(courses);  // Ensure unique representation
            String key = String.join(",", courses); // Create a unique key

            courseCombinations.put(key, courseCombinations.getOrDefault(key, 0) + 1);
        }

        // Find the most popular combination count
        int maxCount = Collections.max(courseCombinations.values());

        // Count how many students picked the most popular combination
        int totalWinners = 0;
        for (int count : courseCombinations.values()) {
            if (count == maxCount) {
                totalWinners += count;
            }
        }

        System.out.println(totalWinners);
    }
}
