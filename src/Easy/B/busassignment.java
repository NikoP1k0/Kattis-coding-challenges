package Easy.B;

import java.util.Scanner;

public class busassignment {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int stops = myScanner.nextInt();
        int currentCapacity = 0;
        int maxCapacity = 0;

        for(int i = 0; i < stops; i++){
            currentCapacity -= myScanner.nextInt();
            currentCapacity += myScanner.nextInt();

            if(currentCapacity > maxCapacity){
                maxCapacity = currentCapacity;
            }
        }

        System.out.println(maxCapacity);
    }
}
