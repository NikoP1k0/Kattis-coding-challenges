package Easy.U;

import java.util.Scanner;

public class ullendullendoff {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int participants = myScanner.nextInt();
        myScanner.nextLine();

        String names = myScanner.nextLine();
        String[] players = names.split(" ");

        if(participants > 13){
            System.out.println(players[13 - 1]);
        } else{
            int temp = 13;
            while(participants < temp){
                temp -= participants;
            }
            System.out.println(players[temp - 1]);
        }

    }
}
