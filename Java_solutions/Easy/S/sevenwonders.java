package Easy.S;

import java.util.Scanner;

public class sevenwonders {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String sequence = myScanner.nextLine();
        int T_count = 0; int C_count = 0; int G_count = 0;

        for(int i = 0; i < sequence.length(); i++){
            switch (sequence.charAt(i)) {
                case 'T' -> T_count++;
                case 'C' -> C_count++;
                case 'G' -> G_count++;
            }
        }

        int minVal = Math.min(T_count, C_count);
        int setCount = Math.min(minVal, G_count);
        int sum = (int) (Math.pow(T_count, 2) + Math.pow(C_count, 2) + Math.pow(G_count, 2) + (7 * setCount));
        System.out.println(sum);
    }
}
