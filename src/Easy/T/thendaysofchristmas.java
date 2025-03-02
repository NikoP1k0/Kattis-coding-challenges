package Easy.T;

import java.util.Scanner;

public class thendaysofchristmas {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int N = myScanner.nextInt();

        int lastDayGiftsSum = (N * (N + 1)) / 2;  // Gifts received on day N
        int totalGifts = 0;

        for (int i = 1; i <= N; i++) {
            totalGifts += (i * (i + 1)) / 2; // Sum of gifts received up to day N
        }

        System.out.println(lastDayGiftsSum);
        System.out.println(totalGifts);
    }
}
