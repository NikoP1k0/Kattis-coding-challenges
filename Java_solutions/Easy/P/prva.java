package Easy.P;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class prva {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dimensions = br.readLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        char[][] grid = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            grid[i] = br.readLine().toCharArray();
        }

        // TreeSet maintains words in sorted order
        TreeSet<String> words = new TreeSet<>();

        // Extract words from rows
        for (int i = 0; i < rows; i++) {
            String[] rowWords = new String(grid[i]).split("#");
            for (String word : rowWords) {
                if (word.length() >= 2) {
                    words.add(word);
                }
            }
        }

        // Extract words from columns
        for (int j = 0; j < cols; j++) {
            StringBuilder colWord = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                if (grid[i][j] == '#') {
                    if (colWord.length() >= 2) {
                        words.add(colWord.toString());
                    }
                    colWord.setLength(0);
                } else {
                    colWord.append(grid[i][j]);
                }
            }
            if (colWord.length() >= 2) {
                words.add(colWord.toString());
            }
        }

        System.out.println(words.first());
    }
}
