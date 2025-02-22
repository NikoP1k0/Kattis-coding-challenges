package Easy.D;

import java.util.Scanner;

public class dragafra {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int coveredWindows = myScanner.nextInt();
        int uncoveredWindows = myScanner.nextInt();
        System.out.println(coveredWindows - uncoveredWindows);
    }
}
