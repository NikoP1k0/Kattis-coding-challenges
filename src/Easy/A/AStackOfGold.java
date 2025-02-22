package Easy.A;

import java.util.Arrays;
import java.util.Scanner;

public class AStackOfGold {

    private static int GoldCoinCalculator(int w, int s){
        int tungstenWeight = 0;

        for(int i = 1; i <= s; i++){
            tungstenWeight += i * 29260;
        }

        int deltaWeight = w - tungstenWeight;
        int GoldCoinCount = deltaWeight / 110;

        return GoldCoinCount;
    }

    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();

        int[] inputArray = Arrays.stream(input.split(" "))
                           .mapToInt(Integer::parseInt).toArray();

        if((inputArray[0] < 87890 || inputArray[0] >  147774000) || (inputArray[1] < 2 || inputArray[1] >  100)){
            System.out.println("Invalid input, at least one of the parameters are out of bounds");
        } else {
            int Coins = GoldCoinCalculator(inputArray[0], inputArray[1]);
            System.out.println(Coins);
        }

    }

}
