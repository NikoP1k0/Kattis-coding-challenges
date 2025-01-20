package Rating_1To2;

import java.util.Scanner;

public class flatbokuveisla {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int slices = myScanner.nextInt();
        int residents = myScanner.nextInt();
        System.out.println(slices % residents);
    }
}
