package Easy.I;

import java.util.Scanner;

public class internationaldates {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String date = myScanner.nextLine();
        String[] parts = date.split("/");
        int part1 = Integer.parseInt(parts[0]);
        int part2 = Integer.parseInt(parts[1]);

        if(part1 > 12){
            System.out.println("EU");
        } else if(part2 > 12){
            System.out.println("US");
        } else{
            System.out.println("either");
        }
    }
}
