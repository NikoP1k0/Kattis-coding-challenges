package Easy.N;

import java.util.Scanner;

public class npuzzle {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char[][] puzzle = new char[4][4];

        // Read input into a 4x4 character array
        for (int i = 0; i < 4; i++) {
            String line = myScanner.nextLine();
            puzzle[i] = line.toCharArray();
        }

        System.out.println(calculateScatter(puzzle));
    }

    private static int calculateScatter(char[][] puzzle) {
        // Target positions for each letter in the solved puzzle
        int[][] targetPositions = {
                {0, 0}, {0, 1}, {0, 2}, {0, 3}, // A, B, C, D
                {1, 0}, {1, 1}, {1, 2}, {1, 3}, // E, F, G, H
                {2, 0}, {2, 1}, {2, 2}, {2, 3}, // I, J, K, L
                {3, 0}, {3, 1}, {3, 2}, {3, 3}  // M, N, O, .
        };

        String targetLetters = "ABCDEFGHIJKLMNOPNO.";  // The expected order
        int scatter = 0;

        // Iterate over the puzzle grid
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                char letter = puzzle[row][col];
                if (letter == '.') continue; // Ignore empty space

                // Find the target index of this letter
                int targetIndex = targetLetters.indexOf(letter);
                int targetRow = targetPositions[targetIndex][0];
                int targetCol = targetPositions[targetIndex][1];

                // Calculate Manhattan distance and add to scatter
                scatter += Math.abs(row - targetRow) + Math.abs(col - targetCol);
            }
        }

        return scatter;
    }
}
