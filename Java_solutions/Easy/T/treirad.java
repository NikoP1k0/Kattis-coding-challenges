package Easy.T;

import java.util.Scanner;

public class treirad {
    public static void main(String[] args){
        Scanner myScanner  = new Scanner(System.in);
        int n = myScanner.nextInt();

        int tripleCount = 0;
        for(int i = 2; ; i++){
            int isTriple = (i - 1) * i * (i + 1);
            if (isTriple >= n) {
                break;
            }
            tripleCount++;
        }

        System.out.println(tripleCount);
    }
}
