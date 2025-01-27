package Easy;

import java.util.Scanner;

public class quadrant {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int x = myScanner.nextInt();
        int y = myScanner.nextInt();

        if(x > 0){
            System.out.println(y > 0 ? 1 : 4);
        } else {
            System.out.println(y > 0 ? 2 : 3);
        }
    }
}
