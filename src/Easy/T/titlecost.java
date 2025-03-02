package Easy.T;

import java.util.Scanner;

public class titlecost {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String title = myScanner.next();
        double maxCost = myScanner.nextDouble();

        int actualCost = 0;
        for(int i = 0; i < title.length(); i++){
            actualCost++;
        }

        if(actualCost < maxCost){
            System.out.println(actualCost);
        } else{
            System.out.printf("%.14f%n", maxCost);
        }
    }
}
