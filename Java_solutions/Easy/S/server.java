package Easy.S;

import java.util.Scanner;

public class server {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int numTasks = myScanner.nextInt();
        int time = myScanner.nextInt();

        int[] tasks = new int[numTasks];
        for(int i = 0; i < numTasks; i++){
            tasks[i] = myScanner.nextInt();
        }

        int tasksCompleted = 0;
        for(int i = 0; i < numTasks; i++){
            int taskTime = tasks[i];

            if(time - taskTime >= 0){
                tasksCompleted++;
                time -= taskTime;
            } else{
                break;
            }
        }

        System.out.println(tasksCompleted);
    }
}
