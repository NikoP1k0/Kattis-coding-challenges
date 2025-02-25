package Easy.K;

import java.util.HashSet;
import java.util.Scanner;

public class karte {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();

        HashSet<String> cards = new HashSet<>();
        for(int i = 0; i < input.length(); i += 3){
            String card = input.substring(i, i + 3);
            if(cards.contains(card)){
                System.out.println("GRESKA");
                return;
            }
            cards.add(card);
        }

        int P = 0; int K = 0; int H = 0; int T = 0;
        for(String card : cards){
            switch (card.charAt(0)) {
                case 'P' -> P++;
                case 'K' -> K++;
                case 'H' -> H++;
                case 'T' -> T++;
            }
        }

        System.out.println((13 - P) + " " + (13 - K) + " " + (13 - H) + " " + (13 - T));
    }
}
