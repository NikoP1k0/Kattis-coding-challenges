package Rating_1To2;

import java.util.Scanner;

public class qaly {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int periods = myScanner.nextInt();
        double sum = 0;

        for(int i = 0; i < periods; i++){
            double quality = myScanner.nextDouble();
            double years = myScanner.nextDouble();

            sum += quality * years;
        }

        System.out.println(sum);
    }
}
