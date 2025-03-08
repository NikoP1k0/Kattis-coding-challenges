package Easy.B;

import java.util.Scanner;

public class breakingbranches {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int branchLength = myScanner.nextInt();

        if(branchLength % 2 == 0){
            System.out.println("Alice");
            System.out.println(1);
        } else{
            System.out.println("Bob");
        }
    }
}
