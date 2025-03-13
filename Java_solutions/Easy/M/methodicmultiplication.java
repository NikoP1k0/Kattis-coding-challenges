package Easy.M;

import java.util.Scanner;

public class methodicmultiplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Read Peano numbers as strings
        String peanoX = myScanner.nextLine();
        String peanoY = myScanner.nextLine();

        // Convert Peano notation to integer
        int x = countSuccessors(peanoX);
        int y = countSuccessors(peanoY);

        // Compute multiplication
        int result = x * y;

        // Convert result back to Peano notation
        String peanoResult = convertToPeano(result);
        System.out.println(peanoResult);
    }

    // Function to count the number of 'S' occurrences to determine the integer value
    private static int countSuccessors(String peano) {
        int count = 0;
        for (char c : peano.toCharArray()) {
            if (c == 'S') count++;
        }
        return count;
    }

    // Function to convert an integer to Peano notation
    private static String convertToPeano(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append("S(");
        }
        sb.append("0");
        for (int i = 0; i < num; i++) {
            sb.append(")");
        }
        return sb.toString();
    }
}
