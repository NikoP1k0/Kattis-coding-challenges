package Easy.F;

import java.util.Scanner;

public class fadingwind {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int h = myScanner.nextInt();
        int k = myScanner.nextInt();
        int v = myScanner.nextInt();
        int s = myScanner.nextInt();

        int distanceTraveled = 0;
        while(h > 0){
            // Increase v by s and decrease v by max(1, v/10)
            v += s;
            v -= Math.max(1, (v/10));

            // If v >= k, increase h by one
            if(v >= k){
                h++;
            }

            // If 0 < v < k, decrease h by one
            if(v > 0 && v < k){
                h--;

                // If h is zero after the decrease, set v to zero.
                if(h == 0){
                    v = 0;
                }
            }

            // If v <= 0, set h and v to zero
            if(v <= 0){
                h = 0;
                v = 0;
            }

            // Increment the distance traveled by v
            distanceTraveled += v;

            // Decrease it s by one unit
            if(s > 0){
                s--;
            }
        }

        System.out.println(distanceTraveled);
    }
}
