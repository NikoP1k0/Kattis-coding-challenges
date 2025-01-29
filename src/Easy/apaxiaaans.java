package Easy;

import java.util.Scanner;

public class apaxiaaans {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String ApaxianName = myScanner.nextLine();
        StringBuilder HumanName = new StringBuilder();

        for(int i = 0; i < ApaxianName.length() - 1; i++){
            char currentChar = ApaxianName.charAt(i);
            char nextChar = ApaxianName.charAt(i + 1);

            if(currentChar != nextChar){
                HumanName.append(currentChar);
            }
        }

        HumanName.append(ApaxianName.charAt(ApaxianName.length() - 1));
        System.out.println(HumanName);
    }
}
