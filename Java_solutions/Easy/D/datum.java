package Easy.D;

import java.time.LocalDate;
import java.util.Scanner;

public class datum {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int day = myScanner.nextInt();
        int month = myScanner.nextInt();
        LocalDate date = LocalDate.of(2009, month, day);
        String dayOfWeek = date.getDayOfWeek().toString();
        System.out.println(dayOfWeek.charAt(0) + dayOfWeek.substring(1).toLowerCase());
    }
}
