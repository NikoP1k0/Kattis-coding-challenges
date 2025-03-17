package Easy.V;

import java.util.Scanner;

public class virus3 {
    public static void main(String[] args){
        Scanner myScanner  = new Scanner(System.in);
        String F = myScanner.nextLine();
        String H = myScanner.nextLine();

        int i = 0, j = 0;
        while(i < F.length() && j < H.length()){
            if(F.charAt(i) == H.charAt(j)){
                i++;
            }
            j++;
        }

        System.out.println(i == F.length() ? "Ja" : "Nej");
    }
}
