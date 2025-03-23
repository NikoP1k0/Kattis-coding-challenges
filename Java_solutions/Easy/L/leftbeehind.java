package Easy.L;

import java.util.Scanner;

public class leftbeehind {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        while(true){
            int sweetJars = myScanner.nextInt();
            int sourJars = myScanner.nextInt();

            if(sweetJars == 0 && sourJars == 0){
                return;
            }

            if(sweetJars == sourJars){
                System.out.println("Undecided.");
            } else if(sweetJars + sourJars == 13) {
                System.out.println("Never speak again.");
            } else{
                System.out.println(sweetJars > sourJars ? "To the convention." : "Left beehind.");
            }
        }
    }
}
