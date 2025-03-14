package Easy.S;

import java.util.Scanner;

public class sith {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.nextLine();
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        int c = myScanner.nextInt();

        if(a - b == c && c < 0){
            System.out.println("JEDI");
        } else if(a - b != c){
            System.out.println("SITH");
        } else{
            System.out.println("VEIT EKKI");
        }
    }
}
