package Easy.A;

import java.util.Scanner;

public class aterriblefortress {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += myScanner.nextInt();
        }

        System.out.println(sum);
    }
}
