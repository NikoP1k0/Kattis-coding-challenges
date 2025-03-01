package Easy.T;

import java.util.Scanner;

public class taisformula {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int samples = myScanner.nextInt();
        int startingVal = myScanner.nextInt();
        double startingTime = myScanner.nextDouble();

        int lastVal = 0;
        double lastTime = 0;
        double sum = 0;
        for(int i = 1; i < samples; i++){
            int currentVal = myScanner.nextInt();
            double currentTime = myScanner.nextDouble();

            double trapezoidArea;
            if(i == 1){
                trapezoidArea = ((startingTime + currentTime) / 2) * (currentVal - startingVal);
            } else{
                trapezoidArea = ((lastTime + currentTime) / 2) * (currentVal - lastVal);
            }
            sum += trapezoidArea;
            lastVal = currentVal;
            lastTime = currentTime;
        }

        System.out.println(sum / 1000);
    }
}
