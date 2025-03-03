package Easy.F;

import java.util.Scanner;

public class findingana {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();
        String answer = word.substring(word.indexOf("a"));
        System.out.println(answer);
    }
}
