package Easy.J;

import java.util.Scanner;

public class janitortroubles {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int s1 = myScanner.nextInt(); int s2 = myScanner.nextInt();
        int s3 = myScanner.nextInt(); int s4 = myScanner.nextInt();

        double semiperimeter = (double) (s1 + s2 + s3 + s4) / 2;
        double area = Math.sqrt((semiperimeter - s1) *
                                (semiperimeter - s2) *
                                (semiperimeter - s3) *
                                (semiperimeter - s4));

        System.out.println(area);
    }
}
