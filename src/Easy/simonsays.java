package Easy;

import java.util.Scanner;

public class simonsays {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numberOfCommands = myScanner.nextInt();
        myScanner.nextLine(); // Clear Line

        for(int i = 0; i < numberOfCommands; i++){
            String command = myScanner.nextLine();
            if(command.startsWith("Simon says")){
                System.out.println(command.substring(11));
            }
        }
    }
}
