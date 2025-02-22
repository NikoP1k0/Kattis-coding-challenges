package Easy.A;

import java.util.Scanner;

public class AShortcutToWhat {

    public static void main(String[] args){
        Scanner newScanner = new Scanner(System.in);
        String input = newScanner.nextLine();

        int n;
        try{
            n = Integer.parseInt(input);
        } catch(NumberFormatException e){
            n = -1;
        }

        if(-1000 > n || n > 1000){
            System.out.println("Outside input range");
        } else {
            System.out.println(((n + 5) * 3) - 10);
        }

    }
}
