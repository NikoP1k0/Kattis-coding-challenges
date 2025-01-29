package Easy;

import java.util.Scanner;

public class faktor {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfArticles = myScanner.nextInt();
        int requiredImpactFactor = myScanner.nextInt();
        System.out.println((numberOfArticles * requiredImpactFactor) - (numberOfArticles - 1));
    }
}
