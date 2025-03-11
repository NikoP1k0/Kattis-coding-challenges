package Easy.H;

import java.util.Scanner;

public class herbmixing {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int greenHerbs = myScanner.nextInt();
        int redHerbs = myScanner.nextInt();

        int totalHP = 0;
        while(greenHerbs > 0){
            if(redHerbs > 0){
                totalHP += 10;
                greenHerbs--;
                redHerbs--;
            } else if(redHerbs == 0 && greenHerbs >= 3){
                totalHP += 10;
                greenHerbs -= 3;
            } else if(redHerbs == 0 && greenHerbs == 2) {
                totalHP += 3;
                greenHerbs -= 2;
            } else{
                totalHP += 1;
                greenHerbs -= 1;
            }
        }

        System.out.println(totalHP);
    }
}
