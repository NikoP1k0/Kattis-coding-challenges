package Easy.H;

import java.util.Scanner;

public class hissingmicrophone {
    public static void main(String[] main){
        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();

        if(word.contains("ss")){
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}
