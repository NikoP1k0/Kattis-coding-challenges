package Easy;

import java.util.Scanner;

public class isithalloween {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String month = myScanner.next();
        int date = myScanner.nextInt();

        switch (month) {
            case "OCT" -> {
                if (date == 31) {
                    System.out.println("yup");
                } else {
                    System.out.println("nope");
                }
            }
            case "DEC" -> {
                if (date == 25) {
                    System.out.println("yup");
                } else {
                    System.out.println("nope");
                }
            }
            default -> System.out.println("nope");
        }
    }
}
