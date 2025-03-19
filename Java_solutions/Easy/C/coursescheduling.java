package Easy.C;

import java.util.*;

public class coursescheduling {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int N = Integer.parseInt(myScanner.nextLine());

        Map<String, Integer> courseCounts = new HashMap<>();
        Set<String> processedRequests = new HashSet<>();

        // Process each student's request
        for (int i = 0; i < N; i++) {
            String[] input = myScanner.nextLine().split(" ");
            String student = input[0] + " " + input[1]; // Full name
            String course = input[2];

            String key = student + " " + course; // Unique identifier

            // Only process if this student hasn't requested the course before
            if (!processedRequests.contains(key)) {
                processedRequests.add(key);
                courseCounts.put(course, courseCounts.getOrDefault(course, 0) + 1);
            }
        }

        List<String> sortedCourses = new ArrayList<>(courseCounts.keySet());
        Collections.sort(sortedCourses);
        for (String course : sortedCourses) {
            System.out.println(course + " " + courseCounts.get(course));
        }
    }
}
