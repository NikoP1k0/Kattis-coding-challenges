package Rating_1To2;

import java.util.Scanner;

public class aboveaverage {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < testCases; i++){

            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            int numberOfStudents = Integer.parseInt(parts[0]);

            int[] grades = new int[numberOfStudents];
            int sum = 0;
            for (int j = 0; j < numberOfStudents; j++) {
                grades[j] = Integer.parseInt(parts[j + 1]);
                sum += grades[j];
            }

            double average = (double) sum / numberOfStudents;

            int aboveAverageCount = 0;
            for (int grade : grades) {
                if (grade > average) {
                    aboveAverageCount++;
                }
            }

            double percentage = (double) aboveAverageCount / numberOfStudents * 100;

            System.out.printf("%.3f%%%n", percentage);
        }
    }

}
