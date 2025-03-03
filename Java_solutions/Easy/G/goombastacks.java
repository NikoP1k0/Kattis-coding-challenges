package Easy.G;

import java.util.Scanner;

public class goombastacks {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int rooms = myScanner.nextInt();
        int gombaCount = 0;

        for(int i = 0; i < rooms; i++){
            gombaCount += myScanner.nextInt();
            int minGoombas = myScanner.nextInt();
            if(gombaCount < minGoombas){
                System.out.println("impossible");
                return;
            }
        }

        System.out.println("possible");
    }
}
