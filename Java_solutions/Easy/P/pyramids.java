package Easy.P;

import java.util.Scanner;

public class pyramids {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int blocks = myScanner.nextInt();
        int height = 0;
        int usedBlocks = 0;
        int sideLength = 1;  // First layer has a 1x1 side

        while (usedBlocks + (sideLength * sideLength) <= blocks) {
            usedBlocks += sideLength * sideLength;
            height++;
            sideLength += 2;  // Next layer has a side length that is 2 larger
        }

        System.out.println(height);
    }
}
