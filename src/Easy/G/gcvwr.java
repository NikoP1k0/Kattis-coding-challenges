package Easy.G;

import java.util.Scanner;

public class gcvwr {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int G = myScanner.nextInt(); int T = myScanner.nextInt(); int N = myScanner.nextInt();
        int sumOfExtraItems = 0;

        for (int i = 0; i < N; i++) {
            sumOfExtraItems += myScanner.nextInt();
        }

        int result = (int) ((G - T) * 0.9 - sumOfExtraItems);
        System.out.println(result);
    }
}
