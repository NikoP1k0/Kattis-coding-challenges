package Easy.W;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class weakvertices {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            int N = myScanner.nextInt();
            if (N == -1) break; // Termination condition

            int[][] graph = new int[N][N];

            // Read adjacency matrix
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    graph[i][j] = myScanner.nextInt();
                }
            }

            List<Integer> weakVertices = new ArrayList<>();

            // Check each vertex for triangle involvement
            for (int v = 0; v < N; v++) {
                boolean inTriangle = false;

                // Find neighbors of vertex v
                for (int u = 0; u < N; u++) {
                    if (graph[v][u] == 1) {  // u is a neighbor of v
                        for (int w = u + 1; w < N; w++) { // Avoid checking same pair twice
                            if (graph[v][w] == 1 && graph[u][w] == 1) {
                                inTriangle = true;
                                break;
                            }
                        }
                    }
                    if (inTriangle) break;
                }

                if (!inTriangle) {
                    weakVertices.add(v);
                }
            }

            for (int vertex : weakVertices) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }
}
