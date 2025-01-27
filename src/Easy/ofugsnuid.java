package Easy;

import java.util.Scanner;

public class ofugsnuid {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = myScanner.nextInt();
        }

        int left = 0, right = sequence.length - 1;
        while(left < right){
            int temp = sequence[left];
            sequence[left] = sequence[right];
            sequence[right] = temp;
            left++;
            right--;
        }

        for(int i = 0; i < n; i++){
            System.out.println(sequence[i]);
        }
    }
}
