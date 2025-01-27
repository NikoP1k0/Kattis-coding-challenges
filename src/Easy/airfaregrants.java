package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class airfaregrants {

    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        int numberOffFlights = myScanner.nextInt();

        int[] flightPrices = new int[numberOffFlights];
        for(int i = 0; i < numberOffFlights; i++){
            flightPrices[i] = myScanner.nextInt();
        }

        int cheapestFlight = Arrays.stream(flightPrices).min().getAsInt();
        int mostExpensiveFlight = Arrays.stream(flightPrices).max().getAsInt();
        int reimbursementLimit = mostExpensiveFlight / 2;

        int reimbursement = Math.min(reimbursementLimit, cheapestFlight);
        int netCost = cheapestFlight - reimbursement;

        System.out.println(netCost);
    }
}
