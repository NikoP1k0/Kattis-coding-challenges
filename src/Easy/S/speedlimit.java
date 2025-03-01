package Easy.S;

import java.util.Scanner;

public class speedlimit {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            int recordings = myScanner.nextInt();

            if(recordings == -1){
                return;
            }

            int distance = 0;
            int lastTime = 0;
            for(int j = 0; j < recordings; j++){
                int speed = myScanner.nextInt();
                int time = myScanner.nextInt();

                distance += speed * (time - lastTime);
                lastTime = time;
            }
            System.out.println(distance + " miles");
        }
    }
}
