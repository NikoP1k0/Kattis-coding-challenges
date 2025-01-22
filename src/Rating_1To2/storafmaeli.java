package Rating_1To2;

import java.util.Scanner;

public class storafmaeli {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int anniversary = myScanner.nextInt();

        if(anniversary % 10 == 0) {
            System.out.println("Jebb");
        } else{
            System.out.println("Neibb");
        }
    }
}
