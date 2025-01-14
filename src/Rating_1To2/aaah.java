package Rating_1To2;

import java.util.Scanner;

    public class aaah {

        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            String Singer = myScanner.nextLine();
            String Doctor = myScanner.nextLine();

            if (Singer.length() >= Doctor.length()) {
                System.out.println("go");
            } else {
                System.out.println("no");
            }
        }
    }
