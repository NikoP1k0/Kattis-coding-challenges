package Easy;

import java.util.Scanner;

public class blandadbest {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int meatTypes = myScanner.nextInt();
        myScanner.nextLine(); // Clear empty space

        if(meatTypes == 1){
            System.out.println(myScanner.nextLine());
        } else {
            System.out.println("blandad best");
        }
    }
}
