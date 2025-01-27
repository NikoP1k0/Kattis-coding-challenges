package Easy;

import java.util.Scanner;

public class autori {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String text = myScanner.nextLine();
        String hyphen = "-";
        StringBuilder initials = new StringBuilder();

        initials.append(text.charAt(0));

        int index = text.indexOf('-');
        while(index >= 0){
            initials.append(text.charAt(index + 1));
            index = text.indexOf(hyphen, index + 1);
        }

        System.out.println(initials);

    }
}
