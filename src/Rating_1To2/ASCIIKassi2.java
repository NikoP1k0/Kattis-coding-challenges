package Rating_1To2;

import java.util.Scanner;

public class ASCIIKassi2 {

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
            System.out.println(" x");
            System.out.println("x x");
            System.out.println(" x");

        } else {

            // Top Line
            StringBuilder output = new StringBuilder();
            String TopCorner = " ".repeat(length + 1) + "x\n";
            output.append(TopCorner);

            // Top line to middle line
            for (int i = 0; i < length; i++) {
                String PaddingLinesNorth = " ".repeat(length - i) + "/" + " ".repeat(2 * i + 1) + "\\\n";
                output.append(PaddingLinesNorth);
            }

            // Middle Line
            String MiddleLine = "x" + " ".repeat(2 * length + 1) + "x\n";
            output.append(MiddleLine);

            // Middle line to bottom line
            for (int i = 0; i < length; i++) {
                String PaddingLinesSouth = " ".repeat(i + 1) + "\\" + " ".repeat(2 * (length - i) - 1) + "/\n";
                output.append(PaddingLinesSouth);
            }

            // Bottom line
            String LastLine = " ".repeat(length + 1) + "x\n";
            output.append(LastLine);

            System.out.print(output);
        }
    }
}
