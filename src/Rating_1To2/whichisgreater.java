package Rating_1To2;

import java.util.Scanner;

public class whichisgreater {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();

        if(a > b){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
