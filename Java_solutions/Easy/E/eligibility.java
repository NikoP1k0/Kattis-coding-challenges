package Easy.E;

import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int testCases = myScanner.nextInt();
        myScanner.nextLine();

        for (int i = 0; i < testCases; i++) {
            String input = myScanner.nextLine();
            String[] parts = input.split(" ");

            String name = parts[0]; // student's name
            String startDate = parts[1]; // start date of post-secondary studies
            String birthDate = parts[2]; // birthdate
            int courses = Integer.parseInt(parts[3]); // number of courses completed

            // Extract the year of start and year of birth
            int startYear = Integer.parseInt(startDate.split("/")[0]);
            int birthYear = Integer.parseInt(birthDate.split("/")[0]);

            // Eligibility check:
            if (startYear >= 2010) {
                System.out.println(name + " eligible");
            } else if (birthYear >= 1991) {
                System.out.println(name + " eligible");
            } else if (courses >= 41) {
                System.out.println(name + " ineligible");
            } else {
                System.out.println(name + " coach petitions");
            }
        }
    }
}
