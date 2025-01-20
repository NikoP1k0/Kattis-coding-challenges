package Rating_1To2;

import java.util.Scanner;

public class reduplikation {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.nextLine();
        int repetitions = myScanner.nextInt();
        System.out.println(word.repeat(repetitions));
    }
}
