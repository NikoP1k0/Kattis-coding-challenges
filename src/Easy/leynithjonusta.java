package Easy;

import java.util.Scanner;

public class leynithjonusta {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String email = myScanner.nextLine();
        System.out.println(email.replaceAll("\\s",""));
    }
}
