package Easy.H;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class haughtycuisine {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int N = myScanner.nextInt();
        myScanner.nextLine();

        List<String> menus = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String menu = myScanner.nextLine();
            menus.add(menu);
        }

        // Pick a random menu
        Random rand = new Random();
        String selectedMenu = menus.get(rand.nextInt(N));

        // Extract and print the dishes
        String[] menuParts = selectedMenu.split(" ");
        int dishCount = Integer.parseInt(menuParts[0]);

        System.out.println(dishCount);
        for (int i = 1; i <= dishCount; i++) {
            System.out.println(menuParts[i]);
        }
    }
}
