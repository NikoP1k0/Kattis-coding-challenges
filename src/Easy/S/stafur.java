package Easy.S;

import java.util.Scanner;

public class stafur {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String letter = myScanner.nextLine();

        switch (letter) {
            case "A", "E", "I", "O", "U", "a", "e", "i", "o", "u" -> System.out.println("Jebb");
            case "Y", "y" -> System.out.println("Kannski");
            default -> System.out.println("Neibb");
        }
    }
}
