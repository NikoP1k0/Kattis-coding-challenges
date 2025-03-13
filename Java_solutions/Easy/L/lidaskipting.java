package Easy.L;

import java.math.BigInteger;
import java.util.Scanner;

public class lidaskipting {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        BigInteger N = myScanner.nextBigInteger();

        if(N.remainder(BigInteger.valueOf(3)).equals(BigInteger.ZERO)){
            System.out.println("Jebb");
        } else{
            System.out.println("Neibb");
        }
    }
}
