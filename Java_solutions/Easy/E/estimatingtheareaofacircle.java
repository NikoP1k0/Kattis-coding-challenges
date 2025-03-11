package Easy.E;

import java.text.DecimalFormat;
import java.util.Scanner;

public class estimatingtheareaofacircle {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.########");  // Up to 5 decimals, no trailing zeros

        while(true){
            double radius = myScanner.nextDouble();
            double markedPoints = myScanner.nextDouble();
            double pointsInsideCircle = myScanner.nextDouble();

            if(radius == 0 && markedPoints == 0 && pointsInsideCircle == 0){
                return;
            }

            double estimatedArea = (pointsInsideCircle / markedPoints) * 4 * Math.pow(radius, 2);
            double actualArea = Math.PI * Math.pow(radius, 2);

            System.out.println(df.format(actualArea) + " " + df.format(estimatedArea));
        }
    }
}
