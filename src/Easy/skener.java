package Easy;

import java.util.Scanner;

public class skener {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int rows = myScanner.nextInt();
        int columns = myScanner.nextInt(); // Not Used
        int Zr = myScanner.nextInt();
        int Zc = myScanner.nextInt();
        myScanner.nextLine(); // Clear Line

        for(int i = 0; i < rows; i++){
            String line = myScanner.nextLine();
            StringBuilder alteredLine = new StringBuilder();

            for(int j = 0; j < line.length(); j++){
                char ch = line.charAt(j);
                alteredLine.append(String.valueOf(ch).repeat(Zc));
            }

            for(int z = 0; z < Zr; z++){
                System.out.println(alteredLine);
            }
        }
    }
}
