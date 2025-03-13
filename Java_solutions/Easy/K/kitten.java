package Easy.K;

import java.util.*;

public class kitten {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int kittenBranch = myScanner.nextInt();

        // Initialize a map to store the tree relationships
        Map<Integer, Integer> parentMap = new HashMap<>();

        // Reading the branching structure
        myScanner.nextLine(); // Consume the newline after the branch number
        while (true) {
            String line = myScanner.nextLine();
            if (line.equals("-1")) break; // End of tree description

            String[] parts = line.split(" ");
            int parent = Integer.parseInt(parts[0]);

            for (int i = 1; i < parts.length; i++) {
                int child = Integer.parseInt(parts[i]);
                parentMap.put(child, parent); // Each child points to its parent
            }
        }

        // Now, trace the path from the kitten's branch to the root
        List<Integer> path = new ArrayList<>();
        int currentBranch = kittenBranch;

        // Trace up to the root
        while (currentBranch != -1) {
            path.add(currentBranch);
            currentBranch = parentMap.getOrDefault(currentBranch, -1); // Get parent, or -1 if it's the root
        }

        // Print the path
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i));
            if (i < path.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
