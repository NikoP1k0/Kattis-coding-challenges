package Easy.O;

import java.util.Scanner;

public class onechicken {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int guests = myScanner.nextInt();
        int chicken = myScanner.nextInt();

        if(guests > chicken && guests - chicken == 1){
            System.out.println("Dr. Chaz needs " + 1 + " more piece of chicken!");
        } else if(guests > chicken){
            System.out.println("Dr. Chaz needs " + (guests - chicken) + " more pieces of chicken!");
        } else if(guests < chicken && chicken - guests == 1) {
            System.out.println("Dr. Chaz will have " + 1 + " piece of chicken left over!");
        } else if(guests < chicken) {
            System.out.println("Dr. Chaz will have " + (chicken - guests) + " pieces of chicken left over!");
        }
    }
}
