package Easy.D;

import java.util.Scanner;

public class doublepassword {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String p1 = myScanner.nextLine();
        String p2 = myScanner.nextLine();
        int combinationSum = 1;

        for(int i = 0; i < p1.length(); i++){
            char digit1 = p1.charAt(i);
            char digit2 = p2.charAt(i);

            if(digit1 == digit2){
                combinationSum *= 1;
            } else{
                combinationSum *= 2;
            }
        }

        System.out.println(combinationSum);
    }
}
