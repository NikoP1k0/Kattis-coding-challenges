package Easy;

import java.util.Scanner;

public class ekkidaudi {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String Line1 = myScanner.nextLine();
        String Line2 = myScanner.nextLine();

        String[] sentenceParts1 = Line1.split("\\|");
        String[] sentenceParts2 = Line2.split("\\|");

        System.out.println(sentenceParts1[0] + sentenceParts2[0] + " " + sentenceParts1[1] + sentenceParts2[1]);
    }
}
