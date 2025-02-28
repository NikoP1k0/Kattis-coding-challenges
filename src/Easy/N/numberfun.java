package Easy.N;

import java.util.Scanner;

public class numberfun {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();

        for(int i = 0; i < testCases; i++){
            int a = myScanner.nextInt();
            int b = myScanner.nextInt();
            int c = myScanner.nextInt();

            if(a + b == c || a * b == c || a - b == c || b - a == c || (a / b == c && a % b == 0) || (b / a == c && b % a == 0)){
                System.out.println("Possible");
            } else{
                System.out.println("Impossible");
            }
        }
    }
}
