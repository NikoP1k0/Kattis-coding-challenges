package Easy.C;

import java.util.Scanner;

public class codetosavelives {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        myScanner.nextLine();

        String[] sums = new String[testCases];
        for(int i = 0; i < testCases; i++){
            String firstNumber = myScanner.nextLine().replaceAll(" ", "");
            String secondNumber = myScanner.nextLine().replaceAll(" ", "");

            int sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
            sums[i] = String.valueOf(sum);
        }

        for(int i = 0; i < testCases; i++){
            StringBuilder output = new StringBuilder();
            for(int j = 0; j < sums[i].length(); j++){
                output.append(sums[i].charAt(j)).append(" ");
            }

            System.out.println(output.toString().trim());
        }
    }
}
