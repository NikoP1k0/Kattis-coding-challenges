package Easy.B;

import java.util.Scanner;

public class babybites {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int mumbles = myScanner.nextInt();
        myScanner.nextLine();

        int currentCount = 0;
        for(int i = 0; i < mumbles; i++){
            String mumble = myScanner.next();
            currentCount++;

            if(!mumble.equals("mumble") && Integer.parseInt(mumble) != currentCount){
                System.out.println("something is fishy");
                return;
            }
        }

        System.out.println("makes sense");
    }
}
