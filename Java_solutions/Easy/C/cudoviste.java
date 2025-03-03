package Easy.C;

import java.util.Scanner;

public class cudoviste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read dimensions
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        // Read the grid
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            grid[i] = scanner.nextLine().toCharArray();
        }

        // Array to count parking spaces by squashed cars
        int[] counts = new int[5];  // [0, 1, 2, 3, 4] squashed cars

        // Check all possible 2x2 parking spaces
        for (int i = 0; i < R - 1; i++) {
            for (int j = 0; j < C - 1; j++) {
                if (canPark(grid, i, j)) {
                    int carsSquashed = countCars(grid, i, j);
                    counts[carsSquashed]++;
                }
            }
        }

        // Print the results
        for (int count : counts) {
            System.out.println(count);
        }

        scanner.close();
    }

    // Check if the 2x2 space contains a building ('#')
    private static boolean canPark(char[][] grid, int i, int j) {
        return grid[i][j] != '#' && grid[i][j+1] != '#' &&
                grid[i+1][j] != '#' && grid[i+1][j+1] != '#';
    }

    // Count the number of 'X' (cars) in the 2x2 space
    private static int countCars(char[][] grid, int i, int j) {
        int count = 0;
        if (grid[i][j] == 'X') count++;
        if (grid[i][j+1] == 'X') count++;
        if (grid[i+1][j] == 'X') count++;
        if (grid[i+1][j+1] == 'X') count++;
        return count;
    }
}

