package Easy;

import java.util.Scanner;

public class ginfizz {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int amountOfGinFizz = myScanner.nextInt();
        System.out.println(amountOfGinFizz * 45 + " ml gin");
        System.out.println(amountOfGinFizz * 30 + " ml fresh lemon juice");
        System.out.println(amountOfGinFizz * 10 + " ml simple syrup");
        System.out.println((amountOfGinFizz == 1) ? amountOfGinFizz + " slice of lemon" : amountOfGinFizz + " slices of lemon");
    }
}
