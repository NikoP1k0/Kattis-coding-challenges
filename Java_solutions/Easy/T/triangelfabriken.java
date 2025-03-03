package Easy.T;

import java.util.Scanner;

public class triangelfabriken {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] angles = new int[3];

        for(int i = 0; i < 3; i++){
            angles[i] = myScanner.nextInt();
        }

        for(int i = 0; i < angles.length; i++){
            if(angles[i] > 90){
                System.out.println("Trubbig Triangel");
                return;
            } else if(angles[i] == 90) {
                System.out.println("Ratvinklig Triangel");
                return;
            }
        }

        System.out.println("Spetsig Triangel");
    }
}
