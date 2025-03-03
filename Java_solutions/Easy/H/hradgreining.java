package Easy.H;

import java.util.Scanner;

public class hradgreining {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String sequence = myScanner.nextLine();
        if(sequence.contains("COV")){
            System.out.println("Veikur!");
        } else {
            System.out.println("Ekki veikur!");
        }
    }
}
