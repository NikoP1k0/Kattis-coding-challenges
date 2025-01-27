package Easy;

import java.util.Scanner;

public class equalshots {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();

        int firstShot = 0;
        for(int i = 0; i < a; i++){
            int v = myScanner.nextInt();
            int c = myScanner.nextInt();
            firstShot += v * c;
        }

        int secondShot = 0;
        for(int i = 0; i < b; i++){
            int v = myScanner.nextInt();
            int c = myScanner.nextInt();
            secondShot += v * c;
        }

        if(firstShot == secondShot){
            System.out.println("same");
        } else{
            System.out.println("different");
        }
    }
}
