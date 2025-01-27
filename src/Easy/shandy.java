package Easy;

import java.util.Scanner;

public class shandy {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int Beers = myScanner.nextInt(); int Lemonade = myScanner.nextInt();
        System.out.println(Math.min(Beers, Lemonade) * 2);
    }
}
