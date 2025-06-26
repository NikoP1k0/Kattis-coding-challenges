package Easy.B;

import java.util.Scanner;

public class buildinfences {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numPlants = myScanner.nextInt();

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 0; i < numPlants; i++) {
            int x = myScanner.nextInt();
            int y = myScanner.nextInt();
            if (x < minX) minX = x;
            if (x > maxX) maxX = x;
            if (y < minY) minY = y;
            if (y > maxY) maxY = y;
        }

        int width = maxX - minX + 2;
        int height = maxY - minY + 2;
        int perimeter = 2 * (width + height);

        System.out.println(perimeter);
    }
}
