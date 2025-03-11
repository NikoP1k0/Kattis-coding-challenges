package Easy.F;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class fallingapart {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int pieces = myScanner.nextInt();

        Integer[] integerArr = new Integer[pieces];
        for(int i = 0; i < pieces; i++){
            integerArr[i] = myScanner.nextInt();
        }
        Arrays.sort(integerArr, Collections.reverseOrder());

        int Alice = 0;
        int Bob = 0;
        for(int i = 0; i < pieces; i++){
            if(i % 2 == 0){
                Alice += integerArr[i];
            } else{
                Bob += integerArr[i];
            }
        }

        System.out.println(Alice + " " + Bob);
    }
}
