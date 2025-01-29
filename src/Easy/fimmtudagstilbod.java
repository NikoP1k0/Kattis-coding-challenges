package Easy;

import java.util.Scanner;

public class fimmtudagstilbod {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int year = myScanner.nextInt();
        int yearsAfterPriceHike = 0;

        if(year > 2020){
            for(int i = 0; i < year - 2020; i++){
                yearsAfterPriceHike++;
            }
            System.out.println(1000 + (yearsAfterPriceHike * 100));
        } else {
            System.out.println(1000);
        }

    }
}
