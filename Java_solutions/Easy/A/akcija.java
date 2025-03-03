package Easy.A;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class akcija {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfBooks = myScanner.nextInt();

        Integer[] bookPrices = new Integer[numberOfBooks];

        for(int i = 0; i < numberOfBooks; i++){
            bookPrices[i] = myScanner.nextInt();
        }
        Arrays.sort(bookPrices, Collections.reverseOrder());

        int totalCosts = 0;
        int counter = 0;

        for(int i = 0; i < bookPrices.length; i++){
            if(counter == 2){
                counter = 0;
            } else {
                totalCosts += bookPrices[i];
                counter++;
            }
        }

        System.out.println(totalCosts);
    }
}
