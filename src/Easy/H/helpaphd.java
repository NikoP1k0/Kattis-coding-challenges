package Easy.H;

import java.util.Scanner;

public class helpaphd {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        myScanner.nextLine();

        for(int i = 0; i < testCases; i++){
            String equation = myScanner.nextLine();

            if (equation.contains("+")) {
                // Split the equation into two parts
                String[] parts = equation.split("\\+");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);
                System.out.println(num1 + num2);
            } else {
                System.out.println("skipped");
            }
        }
    }
}
