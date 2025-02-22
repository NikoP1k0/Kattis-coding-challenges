package Easy.A;

import java.util.Scanner;

public class avion {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        boolean blimpsFound = false;

        for(int i = 0; i < 5; i++){
            String registration = myScanner.nextLine();
            if(registration.contains("FBI")){
                System.out.print((i + 1) + " ");
                blimpsFound = true;
            }
        }

        if(!blimpsFound){
            System.out.println("HE GOT AWAY!");
        }
    }
}
