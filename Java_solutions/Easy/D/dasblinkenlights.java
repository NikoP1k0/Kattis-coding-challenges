package Easy.D;

import java.util.HashSet;
import java.util.Scanner;

public class dasblinkenlights {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int p = myScanner.nextInt(); int q = myScanner.nextInt(); int s = myScanner.nextInt();

        HashSet<Integer> pTimes = new HashSet<>();
        for(int i = p; i <= s; i += p){
            pTimes.add(i);
        }

        HashSet<Integer> qTimes = new HashSet<>();
        for(int i = q; i <= s; i += q){
            qTimes.add(i);
        }

        for(int i = 1; i <= s; i++){
            if(pTimes.contains(i) && qTimes.contains(i)){
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }
}
