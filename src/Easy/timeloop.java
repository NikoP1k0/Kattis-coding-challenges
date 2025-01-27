package Easy;

import java.util.Scanner;

public class timeloop {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();
        for(int i = 1; i <= number; i++){
            System.out.println(i + " Abracadabra");
        }
    }
}
