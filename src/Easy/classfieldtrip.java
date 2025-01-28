package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class classfieldtrip {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String List1 = myScanner.nextLine();
        String List2 = myScanner.nextLine();
        String combined = List1 + List2;

        char[] combinedArray = combined.toCharArray();
        Arrays.sort(combinedArray);

        String sortedString = new String(combinedArray);
        System.out.println(sortedString);
    }
}
