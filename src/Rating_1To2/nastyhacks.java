package Rating_1To2;

import java.util.Scanner;

public class nastyhacks {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();

        for(int i = 0; i < n; i++){
            int r = myScanner.nextInt();
            int e = myScanner.nextInt();
            int c = myScanner.nextInt();

            if(r == (e - c)){
                System.out.println("does not matter");
            } else{
                System.out.println((r > (e - c)) ? "do not advertise" : "advertise");
            }
        }

    }
}
