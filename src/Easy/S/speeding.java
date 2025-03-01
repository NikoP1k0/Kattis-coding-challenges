package Easy.S;

import java.util.Scanner;

public class speeding {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int photos = myScanner.nextInt();
        int lastTime = myScanner.nextInt();
        int lastDistance = myScanner.nextInt();
        int maxSpeed = 0;

        for(int i = 1; i < photos; i++){
            int time = myScanner.nextInt();
            int distance = myScanner.nextInt();
            int speed = (distance - lastDistance) / (time - lastTime);

            maxSpeed = Math.max(maxSpeed, speed);
            lastTime = time;
            lastDistance = distance;
        }

        System.out.println(maxSpeed);
    }
}
