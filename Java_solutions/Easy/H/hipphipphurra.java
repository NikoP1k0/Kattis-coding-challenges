package Easy.H;

import java.util.Scanner;

public class hipphipphurra {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.nextLine();
        int age = myScanner.nextInt();

        for(int i = 0; i < age; i++) {
            System.out.println("Hipp hipp hurra, " + name + "!");
        }
    }
}
