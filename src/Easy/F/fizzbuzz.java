package Easy.F;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int X = myScanner.nextInt();
        int Y = myScanner.nextInt();
        int N = myScanner.nextInt();

        for(int i = 1; i <= N; i++){
            if(i % Y == 0 && i % X == 0){
                System.out.println("FizzBuzz");
            } else if(i % Y == 0 && i % X != 0){
                System.out.println("Buzz");
            } else if(i % Y != 0 && i % X == 0){
                System.out.println("Fizz");
            } else{
                System.out.println(i);
            }
        }
    }
}
