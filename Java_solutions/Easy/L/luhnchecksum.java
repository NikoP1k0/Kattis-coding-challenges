package Easy.L;

import java.util.Scanner;

public class luhnchecksum {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        myScanner.nextLine();

        for(int i = 0; i < testCases; i++){
            String sequence = myScanner.nextLine();
            System.out.println(calculateSum(sequence) ? "PASS" : "FAIL");
        }
    }

    public static boolean calculateSum(String sequence){
        int sum = 0;
        boolean doubleDigit = false;

        // Traverse the sequence from RIGHT to LEFT
        for (int i = sequence.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(sequence.charAt(i));

            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;
            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }
}
