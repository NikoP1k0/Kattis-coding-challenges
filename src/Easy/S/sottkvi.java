package Easy.S;

import java.util.Scanner;

public class sottkvi {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int numberOfFriends = myScanner.nextInt();
        int daysTilBirthday = myScanner.nextInt();
        int today = myScanner.nextInt();

        int birthdayDate = today + daysTilBirthday;
        int attendingFriends = 0;
        for(int i = 0; i < numberOfFriends; i++){
            int quarantineDay = myScanner.nextInt();
            if (quarantineDay + 14 <= birthdayDate) {
                attendingFriends++;
            }
        }

        System.out.println(attendingFriends);
    }
}
