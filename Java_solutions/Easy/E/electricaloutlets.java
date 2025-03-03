package Easy.E;

import java.util.Scanner;

public class electricaloutlets {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int testcases = myScanner.nextInt();

        for(int i = 0; i < testcases; i++){
            int K = myScanner.nextInt();
            int appliancesPowered = 0;

            for(int j = 0; j < K; j++){
                int outlets = myScanner.nextInt();
                appliancesPowered += outlets - 1;
            }

            System.out.println(appliancesPowered + 1);
        }
    }
}
