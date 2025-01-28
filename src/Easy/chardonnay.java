package Easy;

import java.util.Scanner;

public class chardonnay {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int wineForRecipe = myScanner.nextInt();

        switch (wineForRecipe) {
            case 0 -> System.out.println(0);
            case 7 -> System.out.println(7);
            default -> {
                if (wineForRecipe > 7) {
                } else {
                    System.out.println(wineForRecipe + 1);
                }
            }
        }
    }
}
