package Easy.A;

import java.util.Scanner;

public class areal {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        long area = myScanner.nextLong();
        double side = Math.sqrt(area);
        System.out.println(4 * side);
    }
}
