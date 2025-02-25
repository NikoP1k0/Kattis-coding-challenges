package Easy.M;

import java.util.HashSet;
import java.util.Scanner;

public class magictrick {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String cards = myScanner.nextLine();
        HashSet<Character> uniqueChars = new HashSet<>();

        for(int i = 0; i < cards.length(); i++){
            if(!uniqueChars.contains(cards.charAt(i))){
                uniqueChars.add(cards.charAt(i));
            } else{
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}
