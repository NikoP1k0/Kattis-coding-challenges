package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class modulo {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        HashSet<Integer> uniqueRemainders = new HashSet<>();

        for(int i = 0; i < 10; i++){
            int num = myScanner.nextInt();
            uniqueRemainders.add(num % 42);
        }

        System.out.println(uniqueRemainders.size());
    }
}
