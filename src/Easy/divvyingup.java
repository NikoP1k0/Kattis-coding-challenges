package Easy;

import java.util.Scanner;

public class divvyingup {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int contests = myScanner.nextInt();
        int sum = 0;

        for(int i = 0; i < contests; i++){
            sum += myScanner.nextInt();
        }

        System.out.println((sum % 3 == 0) ? "yes" : "no");
    }
}
