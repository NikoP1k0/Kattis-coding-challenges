package Rating_1To2;

import java.util.Scanner;

public class oddecho {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int N = myScanner.nextInt();
        myScanner.nextLine();

        for(int i = 0; i < N; i++){
            String echo = myScanner.nextLine();
            if(i % 2 == 0){
                System.out.println(echo);
            }
        }
    }
}
