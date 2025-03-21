package Easy.G;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class greedilyincreasing {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int N = myScanner.nextInt();

        int[] order = new int[N];
        for(int i = 0; i < N; i++){
            order[i] = myScanner.nextInt();
        }

        List<Integer> greedyOrder = new ArrayList<>();
        greedyOrder.add(order[0]); // Always add the first element
        for (int i = 1; i < N; i++) {
            if (order[i] > greedyOrder.get(greedyOrder.size() - 1)) {
                greedyOrder.add(order[i]);
            }
        }

        System.out.println(greedyOrder.size());
        for(int num : greedyOrder){
            System.out.print(num + " ");
        }
    }
}
