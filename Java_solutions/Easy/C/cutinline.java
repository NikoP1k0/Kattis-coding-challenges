package Easy.C;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class cutinline {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int n = myScanner.nextInt();
        myScanner.nextLine();

        List<String> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            queue.add(myScanner.nextLine());
        }

        int m = myScanner.nextInt();
        myScanner.nextLine();

        for(int i = 0; i < m; i++){
            String[] event = myScanner.nextLine().split(" ");
            if(event[0].equals("cut")){
                String person = event[1];
                String inFrontOf = event[2];
                int index = queue.indexOf(inFrontOf);
                queue.add(index, person);
            } else if(event[0].equals("leave")){
                String person = event[1];
                queue.remove(person);
            }
        }

        for(String name : queue){
            System.out.println(name);
        }
    }
}
