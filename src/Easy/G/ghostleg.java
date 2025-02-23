package Easy.G;

import java.util.Scanner;

public class ghostleg {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int m = myScanner.nextInt();
        int[] position = new int[n + 1];

        for(int i = 1; i <= n; i++){
            position[i] = i;
        }

        for(int i = 0; i < m; i++){
            int rung = myScanner.nextInt();
            int temp = position[rung];
            position[rung] = position[rung + 1];
            position[rung + 1] = temp;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(position[i]);
        }
    }
}
