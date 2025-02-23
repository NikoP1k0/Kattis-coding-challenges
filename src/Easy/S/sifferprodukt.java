package Easy.S;

import java.util.Scanner;

public class sifferprodukt {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String number = myScanner.nextLine();
        boolean flag = true;
        int sum = 1;

        while(flag){
            sum = 1;

            for(int i = 0; i < number.length(); i++){
                if(number.charAt(i) != '0'){
                    sum *= Integer.parseInt(String.valueOf(number.charAt(i)));
                }
            }

            if(sum < 9){
                flag = false;
            } else {
                number = String.valueOf(sum);
            }
        }

        System.out.print(sum);
    }
}
