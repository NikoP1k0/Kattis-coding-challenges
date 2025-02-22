package Easy.S;

import java.util.Scanner;

public class sibice {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfMatches = myScanner.nextInt();
        int W = myScanner.nextInt(); int H = myScanner.nextInt();

        double diagonal = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));
        for(int i = 0; i < numberOfMatches; i++){
            int matchLength = myScanner.nextInt();
            if(matchLength <= diagonal){
                System.out.println("DA");
            } else{
                System.out.println("NE");
            }
        }
    }
}
