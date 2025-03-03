package Easy.H;

import java.util.Scanner;

public class hairofthedog {
    public static void main(String[] main){
        Scanner myScanner = new Scanner(System.in);
        int numberOfDays = myScanner.nextInt();
        myScanner.nextLine(); // Clear
        String[] loggedBehaviour = new String[numberOfDays];

        for(int i = 0; i < numberOfDays; i++){
            loggedBehaviour[i] = myScanner.nextLine();
        }

        int count = 0;
        for(int i = 0; i < numberOfDays; i++){
            switch(loggedBehaviour[i]){
                case "drunk":
                    if((i + 1 < numberOfDays) && loggedBehaviour[i + 1].equals("sober")){count++;}
            }
        }
        System.out.println(count);
    }
}
