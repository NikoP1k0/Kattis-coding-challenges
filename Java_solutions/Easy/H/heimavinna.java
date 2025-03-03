package Easy.H;

import java.util.Scanner;

public class heimavinna {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String problems = myScanner.nextLine();
        int problemSum = 0;

        String[] parts = problems.split(";");

        for (String part : parts) {
            if (part.contains("-")) {
                String[] range = part.split("-");
                int start = Integer.parseInt(range[0]);
                int end = Integer.parseInt(range[1]);
                problemSum += (end - start + 1);
            } else {
                problemSum += 1;
            }
        }
        System.out.println(problemSum);
    }
}
