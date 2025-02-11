package Easy;

import java.util.Scanner;

public class sumkindofproblem {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int dataSets = myScanner.nextInt();

        for(int i = 0; i < dataSets; i++){
            int k = myScanner.nextInt();
            int n = myScanner.nextInt();

            int s1 = (n * (n + 1)) / 2;
            int s2 = (int) Math.pow(n, 2);
            int s3 = n * (n + 1);

            System.out.println(k + " " + s1 + " " + s2 + " " + s3);
        }
    }
}
