package Easy.Z;

import java.util.Scanner;

public class zanzibar {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();

        for(int i = 0; i < testCases; i++){
            int prev = myScanner.nextInt(); // First year's turtle count
            int sum = 0;

            while (true) {
                int current = myScanner.nextInt();
                if (current == 0) break;

                if (current > 2 * prev) {
                    sum += (current - 2 * prev);
                }

                prev = current;
            }

            System.out.println(sum);
        }
    }
}
