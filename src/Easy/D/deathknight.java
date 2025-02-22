package Easy.D;

import java.util.Scanner;

public class deathknight {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int battles = myScanner.nextInt();
        int battlesWon = 0;
        myScanner.nextLine();

        for(int i = 0; i < battles; i++){
            String spells = myScanner.nextLine();
            if(!spells.contains("CD")){
                battlesWon++;
            }
        }

        System.out.println(battlesWon);
    }
}
