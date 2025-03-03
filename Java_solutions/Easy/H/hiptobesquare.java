package Easy.H;

import java.util.Scanner;

public class hiptobesquare {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        myScanner.nextLine();

        for(int i = 0; i < testCases; i++){
            int numBlocks = myScanner.nextInt();
            System.out.println(calculateLayers(numBlocks));
        }

    }

    public static int calculateLayers(int blocks) {
        int layers = 0;

        while (4 * layers * (layers + 1) <= blocks) {
            layers++;
        }

        return layers - 1; // The last increment exceeds blocks, so return previous valid value
    }
}
