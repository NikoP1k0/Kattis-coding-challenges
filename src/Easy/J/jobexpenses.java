package Easy.J;

import java.util.Scanner;

public class jobexpenses {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfExpensesAndIncomes = myScanner.nextInt();
        int expensesSum = 0;

        for(int i = 0; i < numberOfExpensesAndIncomes; i++){
            int number = myScanner.nextInt();
            if(number < 0){
                expensesSum += number;
            }
        }

        System.out.println(expensesSum * -1);
    }
}
