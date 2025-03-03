package Easy.F;

import java.util.Scanner;

public class fyi {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String number = myScanner.nextLine();
        String prefix = number.length() >= 3 ? number.substring(0, 3) : number;

        if(prefix.contains("555")){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
