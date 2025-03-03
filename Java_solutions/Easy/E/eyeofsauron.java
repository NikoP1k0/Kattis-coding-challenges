package Easy.E;

import java.util.Scanner;

public class eyeofsauron {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String drawing = myScanner.nextLine();
        String leftSide = drawing.substring(0, drawing.indexOf('('));
        String rightSide = drawing.substring(drawing.indexOf(')'));
        System.out.println((rightSide.length() - 1 == leftSide.length()) ? "correct" : "fix");
    }
}
