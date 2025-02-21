package Easy;

import java.util.Scanner;

public class zoom {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int k = myScanner.nextInt();
        int counter = 0;

        for(int i = 0; i < n; i++){
            int num = myScanner.nextInt();
            counter++;

            if(counter == k){
                System.out.print(num + " ");
                counter = 0;
            }
        }
    }
}
