package Easy.B;

import java.util.Scanner;

public class blackthorn {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();
        System.out.println(word.contains("kth") ? "yes" : "no");
    }
}
