package Easy;

import java.util.Scanner;

public class takkar {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int trumpButtonSize = myScanner.nextInt();
        int kimsButtonSize = myScanner.nextInt();

        switch(Integer.compare(trumpButtonSize, kimsButtonSize)){
            case -1:
                System.out.println("FAKE NEWS!");
                break;
            case 0:
                System.out.println("WORLD WAR 3!");
                break;
            case 1:
                System.out.println("MAGA!");
                break;
        }
    }
}
