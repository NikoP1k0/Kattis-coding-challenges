package Easy.D;

import java.util.Scanner;

public class detaileddifferences {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int testCases = myScanner.nextInt();
        myScanner.nextLine();

        for(int i = 0; i < testCases; i++){
            String firstLine = myScanner.nextLine();
            String secondLine = myScanner.nextLine();
            StringBuilder differenceLine = new StringBuilder();

            for(int j = 0; j < firstLine.length(); j++){
                if(firstLine.charAt(j) == secondLine.charAt(j)){
                    differenceLine.append('.');
                } else{
                    differenceLine.append('*');
                }
            }

            System.out.println(firstLine);
            System.out.println(secondLine);
            System.out.println(differenceLine);
            System.out.println(" ");
        }
    }
}
