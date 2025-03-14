package Easy.S;

import java.util.Scanner;

public class snowfall {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int days = myScanner.nextInt();

        int snow = 0;
        for(int i = 0; i < days; i++){
            int t = myScanner.nextInt();
            int a = myScanner.nextInt();

            if(t == 0){
                snow += a;
            } else{
                if(snow - a <= 0){
                    snow = 0;
                } else{
                    snow -= a;
                }
            }
        }

        System.out.println(snow);
    }
}
