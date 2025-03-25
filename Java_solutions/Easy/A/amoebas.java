package Easy.A;

import java.util.Arrays;
import java.util.Scanner;

public class amoebas {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Read dimensions
        int m = myScanner.nextInt();
        int n = myScanner.nextInt();
        myScanner.nextLine();

        // Read the grid
        char[][] map = new char[m][n];
        for (int i = 0; i < m; i++) {
            map[i] = myScanner.nextLine().toCharArray();
        }

        // Create visited array
        boolean[] visited = new boolean[m * n];
        Arrays.fill(visited, false);

        int counter = 0;

        // Traverse the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == '#' && !visited[i * n + j]) {
                    int x = i, y = j;
                    int val;

                    while (!visited[val = x * n + y]) {
                        visited[val] = true;
                        boolean moved = false;

                        for (int a = -1; a <= 1; a++) {
                            for (int b = -1; b <= 1; b++) {
                                if (a != 0 || b != 0) {
                                    int newX = x + a;
                                    int newY = y + b;
                                    int newVal = newX * n + newY;

                                    if (newX >= 0 && newX < m && newY >= 0 && newY < n &&
                                            map[newX][newY] == '#' && !visited[newVal]) {
                                        x = newX;
                                        y = newY;
                                        moved = true;
                                        break;
                                    }
                                }
                            }
                            if (moved) break;
                        }
                    }
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
