package Easy;

import java.util.Scanner;

public class aldur {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfFriends = myScanner.nextInt();
        int currentYoungestAge = myScanner.nextInt();

        for(int i = 1; i < numberOfFriends; i++){
            int currentAge = myScanner.nextInt();

            if(currentAge < currentYoungestAge){
                currentYoungestAge = currentAge;
            }
        }

        System.out.println(currentYoungestAge);
    }

}
