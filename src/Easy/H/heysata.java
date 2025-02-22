package Easy.H;

import java.util.Scanner;

public class heysata {
    public static void main(String[] main){
        Scanner myScanner = new Scanner(System.in);
        int numberOfHaystacks = myScanner.nextInt(); // not used
        myScanner.nextLine(); // clear
        String needle = myScanner.nextLine();
        String haystack = myScanner.nextLine();

        if(haystack.contains(needle)){
            System.out.println("Unnar fann hana!");
        } else {
            System.out.println("Unnar fann hana ekki!");
        }
    }
}
