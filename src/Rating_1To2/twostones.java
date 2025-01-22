package Rating_1To2;

import java.util.Scanner;

public class twostones {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int stones = myScanner.nextInt();

        if(stones % 2 == 0) {
            System.out.println("Bob");
        } else{
            System.out.println("Alice");
        }
    }
}
