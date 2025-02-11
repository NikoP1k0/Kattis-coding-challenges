package Easy;

import java.util.Scanner;

public class undeadoralive {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String sms = myScanner.nextLine();

        if(sms.contains(":)") && sms.contains(":(")){
            System.out.println("double agent");
        } else if(sms.contains(":)")){
            System.out.println("alive");
        } else if(sms.contains(":(")){
            System.out.println("undead");
        } else{
            System.out.println("machine");
        }
    }
}
