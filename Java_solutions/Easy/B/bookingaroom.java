package Easy.B;

import java.util.HashSet;
import java.util.Scanner;

public class bookingaroom {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int r = myScanner.nextInt();
        int n = myScanner.nextInt();

        HashSet<Integer> bookedRooms = new HashSet<>();
        for(int i = 0; i < n; i++){
            bookedRooms.add(myScanner.nextInt());
        }

        for(int i = 1; i <= r; i++){
            if(!bookedRooms.contains(i)){
                System.out.println(i);
                return;
            }
        }

        System.out.println("too late");
    }
}
