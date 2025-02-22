package Easy.O;

import java.util.Scanner;

public class oddities {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();

        for(int i = 0; i < testCases; i++){
            int number = myScanner.nextInt();
            System.out.println((number % 2 == 0) ? number + " is even" : number + " is odd");
        }
    }
}
