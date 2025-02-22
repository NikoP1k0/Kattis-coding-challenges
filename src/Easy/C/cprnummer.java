package Easy.C;

import java.util.Scanner;

public class cprnummer {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String CPRNumber = myScanner.nextLine();
        int sum = 0;

        for(int i = 0; i <= 10; i++){
            if(i != 6) {
                int num = Integer.parseInt(String.valueOf(CPRNumber.charAt(i)));
                switch (i) {
                    case 0, 7 -> {
                        sum += num * 4;
                    }
                    case 1, 8 -> {
                        sum += num * 3;
                    }
                    case 2, 9 -> {
                        sum += num * 2;
                    }
                    case 3 -> {
                        sum += num * 7;
                    }
                    case 4 -> {
                        sum += num * 6;
                    }
                    case 5 -> {
                        sum += num * 5;
                    }
                    case 10 -> {
                        sum += num;
                    }
                }
            }
        }

        System.out.println((sum % 11 == 0) ? 1 : 0);
    }
}
