package Easy.P;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pvbg {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numRows = Integer.parseInt(br.readLine());
        String[] peashooterStr = br.readLine().split(" ");

        int weakestDefence = Integer.MAX_VALUE;
        for (int i = 0; i < numRows; i++) {
            int currentRow = Integer.parseInt(peashooterStr[i]);
            weakestDefence = Math.min(weakestDefence, currentRow);
        }

        System.out.println(weakestDefence + 1);
    }
}
