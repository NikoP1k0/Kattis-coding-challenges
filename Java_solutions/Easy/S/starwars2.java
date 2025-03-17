package Easy.S;

import java.util.Arrays;
import java.util.Scanner;

public class starwars2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int movies = myScanner.nextInt();

        int[] order = new int[movies];
        for(int i = 0; i < movies; i++){
            order[i] = myScanner.nextInt();
        }

        Arrays.sort(order);
        int third = movies / 3;
        for (int i = third; i < 2 * third; i++) {
            System.out.print(order[i] + " ");
        }
        for (int i = 0; i < third; i++) {
            System.out.print(order[i] + " ");
        }
        for (int i = 2 * third; i < movies; i++) {
            System.out.print(order[i] + " ");
        }
    }
}
