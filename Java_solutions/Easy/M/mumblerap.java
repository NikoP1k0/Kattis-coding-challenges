package Easy.M;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mumblerap {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int stringLength = myScanner.nextInt();
        myScanner.nextLine();
        String rap = myScanner.nextLine();

        // Regular expression to match numbers
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(rap);

        int maxNumber = Integer.MIN_VALUE;
        while (matcher.find()) {
            int num = Integer.parseInt(matcher.group());
            maxNumber = Math.max(maxNumber, num);
        }
        System.out.println(maxNumber);
    }
}
