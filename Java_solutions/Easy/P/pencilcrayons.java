package Easy.P;

import java.util.HashMap;
import java.util.Scanner;

public class pencilcrayons {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int N = myScanner.nextInt();
        int K = myScanner.nextInt();
        myScanner.nextLine();

        int totalRemovals = 0;

        for (int i = 0; i < N; i++) {
            String[] colors = myScanner.nextLine().split(" ");

            HashMap<String, Integer> colorCount = new HashMap<>();
            for (String color : colors) {
                colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
            }

            for (int count : colorCount.values()) {
                if (count > 1) {
                    totalRemovals += count - 1; // Keep one, remove the rest
                }
            }
        }

        System.out.println(totalRemovals);
    }
}
