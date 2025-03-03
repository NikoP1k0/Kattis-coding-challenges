package Easy.H;

import java.util.Scanner;

public class harshadnumbers {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();

        while(!isHarshadNumber(number)){
            number++;
        }

        System.out.println(number);
    }

    public static boolean isHarshadNumber(int num){
        String number = String.valueOf(num);

        int sum = 0;
        for(int i = 0; i < number.length(); i++){
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        return num % sum == 0;
    }
}
