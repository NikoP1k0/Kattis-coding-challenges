package Easy.A;

import java.util.Arrays;
import java.util.Scanner;

public class abc {
    // A is the smallest value, B is the seconds smallest and C is the largest value (A<B<C)

    private static int[] OrderCalculator(int[] inputNumbers, char[] order){

        int CorrectOrder[] = new int[3];

        for(int i = 0; i < 3; i++){

            switch(order[i]){

                case 'A':
                    int minValue = inputNumbers[0];
                    for(int j = 0; j < 3; j++){
                        if(inputNumbers[j] <= minValue){minValue = inputNumbers[j];}
                    }

                    CorrectOrder[i] = minValue;
                    break;

                case 'B':
                    int[] sorted = inputNumbers.clone();
                    java.util.Arrays.sort(sorted);
                    int middleValue = sorted[1];
                    CorrectOrder[i] = middleValue;
                    break;

                case 'C':
                    int maxValue = inputNumbers[0];
                    for(int j = 0; j < 3; j++){
                        if(inputNumbers[j] >= maxValue){maxValue = inputNumbers[j];}
                    }

                    CorrectOrder[i] = maxValue;
                    break;

                default:
                    throw new IllegalArgumentException("Invalid order character: " + order[i]);
            }

        }

        return CorrectOrder;
    }


    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        String input = myScanner.nextLine();
        int[] numbers = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();

        String sequence = myScanner.nextLine();
        char[] letters = sequence.toCharArray();


        int[] finalOrder = OrderCalculator(numbers, letters);

        System.out.println(finalOrder[0] + " " + finalOrder[1] + " " + finalOrder[2]);

    }
}
