package Easy.H;

import java.util.*;

public class hidingplaces {
    static final int BOARD_SIZE = 8;
    static final int[][] MOVES = {
            {-2, -1}, {-2, 1}, {2, -1}, {2, 1},
            {-1, -2}, {-1, 2}, {1, -2}, {1, 2}
    };

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        myScanner.nextLine(); // Consume newline

        while (testCases-- > 0) {
            String startPos = myScanner.nextLine();
            int startX = startPos.charAt(0) - 'a'; // Convert 'a-h' to 0-7
            int startY = startPos.charAt(1) - '1'; // Convert '1-8' to 0-7

            bfs(startX, startY);
        }
    }

    private static void bfs(int startX, int startY) {
        int[][] dist = new int[BOARD_SIZE][BOARD_SIZE];
        for (int[] row : dist) Arrays.fill(row, -1);

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        dist[startX][startY] = 0;

        int maxDist = 0;
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int x = pos[0], y = pos[1];

            for (int[] move : MOVES) {
                int newX = x + move[0], newY = y + move[1];

                if (isValid(newX, newY) && dist[newX][newY] == -1) {
                    dist[newX][newY] = dist[x][y] + 1;
                    maxDist = Math.max(maxDist, dist[newX][newY]);
                    queue.add(new int[]{newX, newY});
                }
            }
        }

        // Collect all "hiding places"
        List<String> hidingPlaces = new ArrayList<>();
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (dist[i][j] == maxDist) {
                    hidingPlaces.add(toChessNotation(i, j));
                }
            }
        }

        // Sorting: First by rank (descending), then by file (ascending)
        hidingPlaces.sort((s1, s2) -> {
            int rank1 = s1.charAt(1) - '0';
            int rank2 = s2.charAt(1) - '0';
            if (rank1 != rank2) {
                return Integer.compare(rank2, rank1); // Higher rank (8) comes first
            }
            return Character.compare(s1.charAt(0), s2.charAt(0)); // Left to right
        });

        // Print the results
        System.out.print(maxDist + " ");
        System.out.println(String.join(" ", hidingPlaces));
    }

    private static boolean isValid(int x, int y) {
        return x >= 0 && x < BOARD_SIZE && y >= 0 && y < BOARD_SIZE;
    }

    private static String toChessNotation(int x, int y) {
        return (char) ('a' + x) + "" + (y + 1);
    }
}
