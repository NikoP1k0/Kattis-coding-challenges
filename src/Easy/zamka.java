package Easy;

import java.util.Scanner;

public class zamka {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int L = myScanner.nextInt(); int D = myScanner.nextInt(); int X = myScanner.nextInt();
        int N = -1; int M = -1;

        for(int i = L; i <= D; i++){
            if(digitSum(i) == X){
                if(N == -1){
                    N = i;
                }
                M = i;
            }
        }

        System.out.println(N);
        System.out.println(M);
    }

    public static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
