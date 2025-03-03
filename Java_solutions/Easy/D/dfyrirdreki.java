package Easy.D;

import java.util.Scanner;

public class dfyrirdreki {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt(); int b = myScanner.nextInt(); int c = myScanner.nextInt();
        Double Discriminant = Math.pow(b, 2) - (4 * a * c);

        if(Discriminant == 0){
            System.out.println(1);
        } else{
            System.out.println((Discriminant > 0) ? 2 : 0);
        }
    }
}
