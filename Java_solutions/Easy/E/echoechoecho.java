package Easy.E;

import java.util.Scanner;

public class echoechoecho {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();
        System.out.println(String.join(" ", word, word, word));
    }
}
