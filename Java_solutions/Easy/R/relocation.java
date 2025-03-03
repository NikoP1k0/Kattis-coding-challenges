package Easy.R;

import java.util.Scanner;

public class relocation {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int companies = myScanner.nextInt();
        int queries = myScanner.nextInt();

        int[] companyLocation = new int[companies + 1];  // 1-based indexing

        // Read initial locations
        for (int i = 1; i <= companies; i++) {
            companyLocation[i] = myScanner.nextInt();
        }

        // Process queries
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < queries; i++) {
            int typeOfQuery = myScanner.nextInt();
            if (typeOfQuery == 1) {
                // Update company location
                int company = myScanner.nextInt();
                int newLocation = myScanner.nextInt();
                companyLocation[company] = newLocation;
            } else {
                // Query distance
                int company1 = myScanner.nextInt();
                int company2 = myScanner.nextInt();
                output.append(Math.abs(companyLocation[company1] - companyLocation[company2])).append("\n");
            }
        }

        System.out.print(output);
    }
}

