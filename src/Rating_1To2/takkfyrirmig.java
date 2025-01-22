package Rating_1To2;

import java.util.Scanner;

public class takkfyrirmig {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int guests = myScanner.nextInt();
        myScanner.nextLine();

        for(int i = 0; i < guests; i++){
            String name = myScanner.nextLine();
            System.out.println("Takk " + name);
        }
    }
}
