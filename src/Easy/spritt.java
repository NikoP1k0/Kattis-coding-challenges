package Easy;

import java.util.Scanner;

public class spritt {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int classrooms = myScanner.nextInt(); int sanitizerBottles = myScanner.nextInt();

        int sum = 0;
        for(int i = 0; i < classrooms; i++){
            sum += myScanner.nextInt();
        }

        System.out.println(sum <= sanitizerBottles ? "Jebb" : "Neibb");
    }
}
