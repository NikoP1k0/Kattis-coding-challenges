package Easy.P;

import java.util.Scanner;

public class prjonamynstur {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int rows = myScanner.nextInt();
        int columns = myScanner.nextInt();
        myScanner.nextLine();

        char[][] pattern = new char[rows][columns];
        for(int i = 0; i < rows; i++){
            String line = myScanner.nextLine();
            char[] linePattern = line.toCharArray();

            System.arraycopy(linePattern, 0, pattern[i], 0, columns);
        }

        int yarn = 0;
        for (char[] chars : pattern) {
            for (char stitch : chars) {
                switch (stitch) {
                    case '.' -> yarn += 20;
                    case 'O' -> yarn += 10;
                    case '\\', '/' -> yarn += 25;
                    case 'A' -> yarn += 35;
                    case '^' -> yarn += 5;
                    case 'v' -> yarn += 22;
                }
            }
        }

        System.out.println(yarn);
    }
}
