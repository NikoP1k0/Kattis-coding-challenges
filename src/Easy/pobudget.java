package Easy;

import java.util.Scanner;

public class pobudget {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfExpensesAndRevenues = myScanner.nextInt();
        myScanner.nextLine(); // Clear line

        int sum = 0;
        for(int i = 0; i < numberOfExpensesAndRevenues; i++){
            myScanner.nextLine(); // Skip the name
            int value = Integer.parseInt(myScanner.nextLine()); // Read the number
            sum += value;
        }

        if(sum > 0){
            System.out.println("Usch, vinst");
        } else if(sum == 0) {
            System.out.println("Lagom");
        } else{
            System.out.println("Nekad");
        }

    }
}
