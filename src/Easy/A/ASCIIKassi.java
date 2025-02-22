package Easy.A;

import java.util.Scanner;

public class ASCIIKassi {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();

        int length = 0;
        try{
            length = Integer.parseInt(input);
        } catch(NumberFormatException e){
            System.out.println("A number is required");
        }

        if(length == 0){
            System.out.println("++");
            System.out.println("++");
        } else {
            String topAndBottom = "+" + "-".repeat(length) + "+\n";
            String middle = "|" + " ".repeat(length) + "|\n";

            StringBuilder output = new StringBuilder();

            output.append(topAndBottom);

            for (int i = 0; i < length; i++) {
                output.append(middle);
            }
            output.append(topAndBottom);

            System.out.print(output);
        }
    }
}
