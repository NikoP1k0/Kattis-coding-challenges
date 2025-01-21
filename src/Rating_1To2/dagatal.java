package Rating_1To2;

import java.util.Scanner;

public class dagatal {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int month = myScanner.nextInt();

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println(30);
                break;
        }
    }
}
