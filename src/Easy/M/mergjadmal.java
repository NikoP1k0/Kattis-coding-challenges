package Easy.M;

import java.util.Scanner;

public class mergjadmal {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String line = myScanner.nextLine();
        System.out.println(line.contains("69") || line.contains("420") ? "Mergjad!" : "Leim!");
    }
}
